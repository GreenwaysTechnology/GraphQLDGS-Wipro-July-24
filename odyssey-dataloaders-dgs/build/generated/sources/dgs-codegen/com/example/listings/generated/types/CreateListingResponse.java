package com.example.listings.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class CreateListingResponse {
  /**
   * Similar to HTTP status code, represents the status of the mutation
   */
  private int code;

  /**
   * Indicates whether the mutation was successful
   */
  private boolean success;

  /**
   * Human-readable message for the UI
   */
  private String message;

  /**
   * The newly created listing
   */
  private Listing listing;

  public CreateListingResponse() {
  }

  public CreateListingResponse(int code, boolean success, String message, Listing listing) {
    this.code = code;
    this.success = success;
    this.message = message;
    this.listing = listing;
  }

  /**
   * Similar to HTTP status code, represents the status of the mutation
   */
  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  /**
   * Indicates whether the mutation was successful
   */
  public boolean getSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  /**
   * Human-readable message for the UI
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * The newly created listing
   */
  public Listing getListing() {
    return listing;
  }

  public void setListing(Listing listing) {
    this.listing = listing;
  }

  @Override
  public String toString() {
    return "CreateListingResponse{" + "code='" + code + "'," +"success='" + success + "'," +"message='" + message + "'," +"listing='" + listing + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateListingResponse that = (CreateListingResponse) o;
        return code == that.code &&
                            success == that.success &&
                            java.util.Objects.equals(message, that.message) &&
                            java.util.Objects.equals(listing, that.listing);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(code, success, message, listing);
  }

  public static com.example.listings.generated.types.CreateListingResponse.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Similar to HTTP status code, represents the status of the mutation
     */
    private int code;

    /**
     * Indicates whether the mutation was successful
     */
    private boolean success;

    /**
     * Human-readable message for the UI
     */
    private String message;

    /**
     * The newly created listing
     */
    private Listing listing;

    public CreateListingResponse build() {
                  com.example.listings.generated.types.CreateListingResponse result = new com.example.listings.generated.types.CreateListingResponse();
                      result.code = this.code;
          result.success = this.success;
          result.message = this.message;
          result.listing = this.listing;
                      return result;
    }

    /**
     * Similar to HTTP status code, represents the status of the mutation
     */
    public com.example.listings.generated.types.CreateListingResponse.Builder code(int code) {
      this.code = code;
      return this;
    }

    /**
     * Indicates whether the mutation was successful
     */
    public com.example.listings.generated.types.CreateListingResponse.Builder success(
        boolean success) {
      this.success = success;
      return this;
    }

    /**
     * Human-readable message for the UI
     */
    public com.example.listings.generated.types.CreateListingResponse.Builder message(
        String message) {
      this.message = message;
      return this;
    }

    /**
     * The newly created listing
     */
    public com.example.listings.generated.types.CreateListingResponse.Builder listing(
        Listing listing) {
      this.listing = listing;
      return this;
    }
  }
}
