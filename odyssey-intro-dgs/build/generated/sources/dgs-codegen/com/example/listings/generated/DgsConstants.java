package com.example.listings.generated;

import java.lang.String;

public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String FeaturedListings = "featuredListings";

    public static final String Listing = "listing";

    public static class LISTING_INPUT_ARGUMENT {
      public static final String Id = "id";
    }
  }

  public static class LISTING {
    public static final String TYPE_NAME = "Listing";

    public static final String Id = "id";

    public static final String Title = "title";

    public static final String Description = "description";

    public static final String NumOfBeds = "numOfBeds";

    public static final String CostPerNight = "costPerNight";

    public static final String ClosedForBookings = "closedForBookings";

    public static final String Amenities = "amenities";
  }

  public static class AMENITY {
    public static final String TYPE_NAME = "Amenity";

    public static final String Id = "id";

    public static final String Category = "category";

    public static final String Name = "name";
  }
}
