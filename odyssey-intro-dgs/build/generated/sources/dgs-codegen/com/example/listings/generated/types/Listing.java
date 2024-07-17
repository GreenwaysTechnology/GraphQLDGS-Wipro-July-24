package com.example.listings.generated.types;

import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

/**
 * A Particular intergalatic location available for booking
 */
public class Listing {
  private String id;

  /**
   * listing tile
   */
  private String title;

  /**
   * The number of bed available
   */
  private Integer numOfBeds;

  /**
   * The cost per night
   */
  private Double costPerNight;

  /**
   * Indicates whether listing is closed for books
   */
  private Boolean closedForBookings;

  public Listing() {
  }

  public Listing(String id, String title, Integer numOfBeds, Double costPerNight,
      Boolean closedForBookings) {
    this.id = id;
    this.title = title;
    this.numOfBeds = numOfBeds;
    this.costPerNight = costPerNight;
    this.closedForBookings = closedForBookings;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * listing tile
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The number of bed available
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
   * Indicates whether listing is closed for books
   */
  public Boolean getClosedForBookings() {
    return closedForBookings;
  }

  public void setClosedForBookings(Boolean closedForBookings) {
    this.closedForBookings = closedForBookings;
  }

  @Override
  public String toString() {
    return "Listing{" + "id='" + id + "'," +"title='" + title + "'," +"numOfBeds='" + numOfBeds + "'," +"costPerNight='" + costPerNight + "'," +"closedForBookings='" + closedForBookings + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Listing that = (Listing) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(numOfBeds, that.numOfBeds) &&
                            java.util.Objects.equals(costPerNight, that.costPerNight) &&
                            java.util.Objects.equals(closedForBookings, that.closedForBookings);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, title, numOfBeds, costPerNight, closedForBookings);
  }

  public static com.example.listings.generated.types.Listing.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    /**
     * listing tile
     */
    private String title;

    /**
     * The number of bed available
     */
    private Integer numOfBeds;

    /**
     * The cost per night
     */
    private Double costPerNight;

    /**
     * Indicates whether listing is closed for books
     */
    private Boolean closedForBookings;

    public Listing build() {
                  com.example.listings.generated.types.Listing result = new com.example.listings.generated.types.Listing();
                      result.id = this.id;
          result.title = this.title;
          result.numOfBeds = this.numOfBeds;
          result.costPerNight = this.costPerNight;
          result.closedForBookings = this.closedForBookings;
                      return result;
    }

    public com.example.listings.generated.types.Listing.Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * listing tile
     */
    public com.example.listings.generated.types.Listing.Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The number of bed available
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
     * Indicates whether listing is closed for books
     */
    public com.example.listings.generated.types.Listing.Builder closedForBookings(
        Boolean closedForBookings) {
      this.closedForBookings = closedForBookings;
      return this;
    }
  }
}
