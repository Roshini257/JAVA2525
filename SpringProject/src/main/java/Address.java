import org.springframework.stereotype.Component;

@Component
public class Address {
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String street;

    public String getCity() {
        return city;
    }

    private String city;

    // Constructors, getters, and setters
}

