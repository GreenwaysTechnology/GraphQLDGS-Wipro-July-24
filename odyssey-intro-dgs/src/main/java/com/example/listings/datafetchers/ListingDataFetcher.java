package com.example.listings.datafetchers;

import com.example.listings.models.ListingModel;
import com.example.listings.services.ListingService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

@DgsComponent
public class ListingDataFetcher {

    private final ListingService listingService;

    @Autowired
    public ListingDataFetcher(ListingService listingService) {
        this.listingService = listingService;
    }

    @DgsQuery
    public List<ListingModel> featuredListings() throws IOException {
          return  listingService.featuredListingsRequest();
    }
}
