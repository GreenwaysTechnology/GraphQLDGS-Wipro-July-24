package com.example.listings.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Amenity {
  private String id;

  /**
   * The amenity category the amenity belongs to
   */
  private String category;

  /**
   * The amenity's name
   */
  private String name;

  public Amenity() {
  }

  public Amenity(String id, String category, String name) {
    this.id = id;
    this.category = category;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The amenity category the amenity belongs to
   */
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * The amenity's name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Amenity{" + "id='" + id + "'," +"category='" + category + "'," +"name='" + name + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amenity that = (Amenity) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(category, that.category) &&
                            java.util.Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, category, name);
  }

  public static com.example.listings.generated.types.Amenity.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    /**
     * The amenity category the amenity belongs to
     */
    private String category;

    /**
     * The amenity's name
     */
    private String name;

    public Amenity build() {
                  com.example.listings.generated.types.Amenity result = new com.example.listings.generated.types.Amenity();
                      result.id = this.id;
          result.category = this.category;
          result.name = this.name;
                      return result;
    }

    public com.example.listings.generated.types.Amenity.Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The amenity category the amenity belongs to
     */
    public com.example.listings.generated.types.Amenity.Builder category(String category) {
      this.category = category;
      return this;
    }

    /**
     * The amenity's name
     */
    public com.example.listings.generated.types.Amenity.Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
