/**
 * Created by Admin on 23.02.2016.
 */
public class Product {
    protected String type;
    protected String brand;
    protected String manufacturer;
    protected int weight;
    protected int dateOFmanufacture;
    protected int dateOFexpiration;

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

    public int getWeight(){

        return weight;
    }
    public void setWeight(int Weight){

        this.weight = Weight;
    }

    public int getDateOfManufacture(){

        return dateOFmanufacture;
    }

    public void setDateOfManufacture(int DateOfManufacture){

        this.dateOFmanufacture = DateOfManufacture;
    }

    public int getDateOfExpiratipn() {

        return dateOFexpiration;
    }

    public void setDateOfExpiration(int DateOfExpiration) {

        this.dateOFexpiration = DateOfExpiration;
    }


    public String toString() {
        return  "Type: " + this.type + "\nBrand: " + this.brand + "\nManufacturer: " + this.manufacturer + "\nWeight: " + this.weight + "\nDate Of Manufacture: " + this.dateOFmanufacture + "\nDate Of Expiration: " + this.dateOFexpiration;
    }
}

