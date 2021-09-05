package java.model;

import java.util.Objects;

/**
 * Address is a representation of the {Student} home address.
 */
public class Address {

    private final String country;

    private final String city;

    private final String street;

    private final Integer houseNumber;

    private Address(Builder builder){
        this.country = builder.country;
        this.city = builder.city;
        this.street = builder.street;
        this.houseNumber = builder.houseNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return getCountry().equals(address.getCountry()) &&
                getCity().equals(address.getCity()) &&
                getStreet().equals(address.getStreet()) &&
                getHouseNumber().equals(address.getHouseNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountry(), getCity(), getStreet(), getHouseNumber());
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }


    /**
     * TODO: implement getters and other methods if necessary
     */

    /**
     * Allows to get the builder for the Address
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder class is a part of the builder pattern implementation
     * Needed to ease the Address object construction
     * <p>
     * TODO: implement the builder functionality
     */
    public static class Builder {
        private String country;
        private String city;
        private String street;
        private Integer houseNumber;

        public Builder country(String country){
            this.country = country;
            return this;
        }

        public Builder city(String city){
            this.city = city;
            return this;
        }

        public Builder street(String street){
            this.street = street;
            return this;
        }

        public Builder houseNumber(int houseNumber){
            this.houseNumber = houseNumber;
            return this;
        }

        public Address build(){
            return new Address(this);
        }

    }

}
