package com.example.listings.generated.types;

import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

/**
 * A particular intergalactic location available for booking
 */
public class Listing {
  private String id;

  /**
   * The listing's title
   */
  private String title;

  /**
   * The listing's description
   */
  private String description;

  /**
   * The number of beds available
   */
  private Integer numOfBeds;

  /**
   * The cost per night
   */
  private Double costPerNight;

  /**
   * Indicates whether listing is closed for bookings (on hiatus)
   */
  private Boolean closedForBookings;

  /**
   * The amenities available for this listing
   */
  private List<Amenity> amenities;

  public Listing() {
  }

  public Listing(String id, String title, String description, Integer numOfBeds,
      Double costPerNight, Boolean closedForBookings, List<Amenity> amenities) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.numOfBeds = numOfBeds;
    this.costPerNight = costPerNight;
    this.closedForBookings = closedForBookings;
    this.amenities = amenities;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The listing's title
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The listing's description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The number of beds available
   */
  public Integer getNumOfBeds() {
    return numOfBeds;
  }

  public void setNumOfBeds(Integer numOfBeds) {
    this.numOfBeds = numOfBeds;
  }

  /**
   * The cost per night
   */
  public Double getCostPerNight() {
    return costPerNight;
  }

  public void setCostPerNight(Double costPerNight) {
    this.costPerNight = costPerNight;
  }

  /**
   * Indicates whether listing is closed for bookings (on hiatus)
   */
  public Boolean getClosedForBookings() {
    return closedForBookings;
  }

  public void setClosedForBookings(Boolean closedForBookings) {
    this.closedForBookings = closedForBookings;
  }

  /**
   * The amenities available for this listing
   */
  public List<Amenity> getAmenities() {
    return amenities;
  }

  public void setAmenities(List<Amenity> amenities) {
    this.amenities = amenities;
  }

  @Override
  public String toString() {
    return "Listing{" + "id='" + id + "'," +"title='" + title + "'," +"description='" + description + "'," +"numOfBeds='" + numOfBeds + "'," +"costPerNight='" + costPerNight + "'," +"closedForBookings='" + closedForBookings + "'," +"amenities='" + amenities + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Listing that = (Listing) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(description, that.description) &&
                            java.util.Objects.equals(numOfBeds, that.numOfBeds) &&
                            java.util.Objects.equals(costPerNight, that.costPerNight) &&
                            java.util.Objects.equals(closedForBookings, that.closedForBookings) &&
                            java.util.Objects.equals(amenities, that.amenities);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, title, description, numOfBeds, costPerNight, closedForBookings, amenities);
  }

  public static com.example.listings.generated.types.Listing.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    /**
     * The listing's title
     */
    private String title;

    /**
     * The listing's description
     */
    private String description;

    /**
     * The number of beds available
     */
    private Integer numOfBeds;

    /**
     * The cost per night
     */
    private Double costPerNight;

    /**
     * Indicates whether listing is closed for bookings (on hiatus)
     */
    private Boolean closedForBookings;

    /**
     * The amenities available for this listing
     */
    private List<Amenity> amenities;

    public Listing build() {
                  com.example.listings.generated.types.Listing result = new com.example.listings.generated.types.Listing();
                      result.id = this.id;
          result.title = this.title;
          result.description = this.description;
          result.numOfBeds = this.numOfBeds;
          result.costPerNight = this.costPerNight;
          result.closedForBookings = this.closedForBookings;
          result.amenities = this.amenities;
                      return result;
    }

    public com.example.listings.generated.types.Listing.Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The listing's title
     */
    public com.example.listings.generated.types.Listing.Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The listing's description
     */
    public com.example.listings.generated.types.Listing.Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The number of beds available
     */
    public com.example.listings.generated.types.Listing.Builder numOfBeds(Integer numOfBeds) {
      this.numOfBeds = numOfBeds;
      return this;
    }

    /**
     * The cost per night
     */
    public com.example.listings.generated.types.Listing.Builder costPerNight(Double costPerNight) {
      this.costPerNight = costPerNight;
      return this;
    }

    /**
     * Indicates whether listing is closed for bookings (on hiatus)
     */
    public com.example.listings.generated.types.Listing.Builder closedForBookings(
        Boolean closedForBookings) {
      this.closedForBookings = closedForBookings;
      return this;
    }

    /**
     * The amenities available for this listing
     */
    public com.example.listings.generated.types.Listing.Builder amenities(List<Amenity> amenities) {
      this.amenities = amenities;
      return this;
    }
  }
}
