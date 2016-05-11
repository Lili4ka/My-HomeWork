package HW2;

public class Product {
    protected String brand;
    protected String manufacturer;
    protected String country;
    protected int weight;
    protected long code;
    protected int dateOfManufacture;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public long getCode() {return code;}

    public void setCode(long code) {this.code = code;}

    public Product(String brand, String manufacturer, String country, int weight, long code) {
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.country = country;
        this.weight = weight;
        this.code = code;
    }

    public String toString() {
        return  "Brand: " + this.brand + "\nManufacturer: " + this.manufacturer + "\nCountry: " + this.country + "\nWeight: " + this.weight + "\nCode: " + this.code;
    }
}
