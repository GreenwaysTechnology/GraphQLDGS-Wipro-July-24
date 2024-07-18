package com.example.listings.generated.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class CreateListingInput {
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
  private int numOfBeds;

  /**
   * The cost per night
   */
  private double costPerNight;

  /**
   * Indicates whether listing is closed for bookings (on hiatus)
   */
  private Boolean closedForBookings;

  /**
   * The Listing's amenities
   */
  private List<String> amenities;

  public CreateListingInput() {
  }

  public CreateListingInput(String title, String description, int numOfBeds, double costPerNight,
      Boolean closedForBookings, List<String> amenities) {
    this.title = title;
    this.description = description;
    this.numOfBeds = numOfBeds;
    this.costPerNight = costPerNight;
    this.closedForBookings = closedForBookings;
    this.amenities = amenities;
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
  public int getNumOfBeds() {
    return numOfBeds;
  }

  public void setNumOfBeds(int numOfBeds) {
    this.numOfBeds = numOfBeds;
  }

  /**
   * The cost per night
   */
  public double getCostPerNight() {
    return costPerNight;
  }

  public void setCostPerNight(double costPerNight) {
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
   * The Listing's amenities
   */
  public List<String> getAmenities() {
    return amenities;
  }

  public void setAmenities(List<String> amenities) {
    this.amenities = amenities;
  }

  @Override
  public String toString() {
    return "CreateListingInput{" + "title='" + title + "'," +"description='" + description + "'," +"numOfBeds='" + numOfBeds + "'," +"costPerNight='" + costPerNight + "'," +"closedForBookings='" + closedForBookings + "'," +"amenities='" + amenities + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateListingInput that = (CreateListingInput) o;
        return java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(description, that.description) &&
                            numOfBeds == that.numOfBeds &&
                            costPerNight == that.costPerNight &&
                            java.util.Objects.equals(closedForBookings, that.closedForBookings) &&
                            java.util.Objects.equals(amenities, that.amenities);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(title, description, numOfBeds, costPerNight, closedForBookings, amenities);
  }

  public static com.example.listings.generated.types.CreateListingInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
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
    private int numOfBeds;

    /**
     * The cost per night
     */
    private double costPerNight;

    /**
     * Indicates whether listing is closed for bookings (on hiatus)
     */
    private Boolean closedForBookings;

    /**
     * The Listing's amenities
     */
    private List<String> amenities;

    public CreateListingInput build() {
                  com.example.listings.generated.types.CreateListingInput result = new com.example.listings.generated.types.CreateListingInput();
                      result.title = this.title;
          result.description = this.description;
          result.numOfBeds = this.numOfBeds;
          result.costPerNight = this.costPerNight;
          result.closedForBookings = this.closedForBookings;
          result.amenities = this.amenities;
                      return result;
    }

    /**
     * The listing's title
     */
    public com.example.listings.generated.types.CreateListingInput.Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The listing's description
     */
    public com.example.listings.generated.types.CreateListingInput.Builder description(
        String description) {
      this.description = description;
      return this;
    }

    /**
     * The number of beds available
     */
    public com.example.listings.generated.types.CreateListingInput.Builder numOfBeds(
        int numOfBeds) {
      this.numOfBeds = numOfBeds;
      return this;
    }

    /**
     * The cost per night
     */
    public com.example.listings.generated.types.CreateListingInput.Builder costPerNight(
        double costPerNight) {
      this.costPerNight = costPerNight;
      return this;
    }

    /**
     * Indicates whether listing is closed for bookings (on hiatus)
     */
    public com.example.listings.generated.types.CreateListingInput.Builder closedForBookings(
        Boolean closedForBookings) {
      this.closedForBookings = closedForBookings;
      return this;
    }

    /**
     * The Listing's amenities
     */
    public com.example.listings.generated.types.CreateListingInput.Builder amenities(
        List<String> amenities) {
      this.amenities = amenities;
      return this;
    }
  }
}
