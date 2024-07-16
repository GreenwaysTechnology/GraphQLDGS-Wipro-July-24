package com.example.listings.datafetchers;

import com.example.listings.models.ListingModel;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

import java.util.List;

@DgsComponent
public class ListingDataFetcher {

    @DgsQuery
    public List<ListingModel> featuredListings(){
        //specific featuredlisting logic goes here
         //array of Listing
        ListingModel listingModel1= new ListingModel();
        listingModel1.setId("1");
        listingModel1.setTitle("Beach House on the edge Ocean");
        listingModel1.setCostPerNight(500.99);
        listingModel1.setNumOfBeds(4);

        ListingModel listingModel2= new ListingModel();
        listingModel2.setId("2");
        listingModel2.setTitle("Beautiful garden, green atmosphere");
        listingModel2.setCostPerNight(500.99);
        listingModel2.setNumOfBeds(4);
        return  List.of(listingModel1,listingModel2);
    }
}
