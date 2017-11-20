package models;

/**
 * Address class to be a simple model to represent an address.
 */
public class Address {

    private String streetAddr;
    private String country;
    private String province;

    public Address(String streetAddr, String country, String province) {
        this.streetAddr = streetAddr;
        this.country = country;
        this.province = province;
    }

    @Override
    public String toString() {
        return "streetAddr='" + streetAddr + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
