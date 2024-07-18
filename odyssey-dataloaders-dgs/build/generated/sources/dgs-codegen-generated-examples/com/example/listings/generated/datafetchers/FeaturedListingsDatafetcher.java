package com.example.listings.generated.datafetchers;

import com.example.listings.generated.types.Listing;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;

@DgsComponent
public class FeaturedListingsDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "featuredListings"
  )
  public List<Listing> getFeaturedListings(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
