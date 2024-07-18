package com.example.listings.generated.datafetchers;

import com.example.listings.generated.types.Listing;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class ListingDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "listing"
  )
  public Listing getListing(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
