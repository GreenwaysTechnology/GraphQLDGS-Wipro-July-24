package com.example.listings.datafetchers;

import com.example.listings.generated.types.Amenity;
import com.example.listings.models.ListingModel;
import com.example.listings.services.ListingService;
import com.netflix.graphql.dgs.*;
import graphql.execution.DataFetcherResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@DgsComponent
public class ListingDataFetcher {

    private final ListingService listingService;

    @Autowired
    public ListingDataFetcher(ListingService listingService) {
        this.listingService = listingService;
    }

    @DgsQuery
    public DataFetcherResult<List<ListingModel>> featuredListings() throws IOException {
        List<ListingModel> listings = listingService.featuredListingsRequest();
        return DataFetcherResult.<List<ListingModel>>newResult()
                .data(listings)
                .localContext(Map.of("hasAmenityData", false))
                .build();
    }

    @DgsQuery
    public DataFetcherResult<ListingModel> listing(@InputArgument String id) {
        ListingModel listing = listingService.listingRequest(id);
        return DataFetcherResult.<ListingModel>newResult()
                .data(listing)
                .localContext(Map.of("hasAmenityData", true))
                .build();
    }

    //This is data fecther: fetch amenities data from amenties end

    @DgsData(parentType = "Listing")
    public List<Amenity> amenities(DgsDataFetchingEnvironment dfe) throws IOException {
        ListingModel listing = dfe.getSource();
        //getListing id
        String id = listing.getId();
        Map<String, Boolean> localContext = dfe.getLocalContext();
        //when this method called
        if (localContext.get("hasAmenityData")) {
            return listing.getAmenities();
        }
        //Follow up
        //when this method called
        return listingService.amenitiesRequest(id);

    }
}
