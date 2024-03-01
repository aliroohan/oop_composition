package Task1;

public class Address {
    private String street;
    private String town;
    private String city;
    private String country;
    private PhoneNumber phoneNumber;

    public Address(String street, String town, String city, String country, PhoneNumber phoneNumber) {
        setStreet(street);
        setTown(town);
        setCity(city);
        setCountry(country);
        setPhoneNumber(phoneNumber);
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
