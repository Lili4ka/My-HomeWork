package HW1;

public class Product {
    protected String type;
    protected String brand;
    protected String manufacturer;
    protected int weight;
    protected int price;


    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

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

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;

    }

    public Product(String type, String brand, String manufacturer, int weight, int price) {
        this.type = type;
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.price = price;
    }

    public String toString() {
        String result = "Тип: " + this.type + "\nБренд: " + this.brand + "\nВиробник: " + this.manufacturer + "\nВага: " + this.weight +  "\nЦіна в гривнях : " + this.price;
        return result;
    }
}
