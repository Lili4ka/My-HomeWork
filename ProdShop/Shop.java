/**
 * Created by Admin on 23.02.2016.
 */
public class Shop {
    protected String name;
    protected String address;
    protected int numberProductOrder;
    protected Product[] productArray;
    protected int number;

    public Shop() {
        this.productArray = new Product[100];
        this.number = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberProductOrder() {
        return number;
    }

    public void setNumberProductOrder(int numberProductOrder) {
        this.numberProductOrder = numberProductOrder;
    }

    public void addProduct(Product product) {
        this.productArray[this.number] = product;
        this.number++;
    }

    public String toString() {
        String result = "You need to order " + this.numberProductOrder + " product for shop " + this.name + " on address " + this.address + ":\n--------\n";
        for(int i = 0; i < this.number; i++) {
            result += this.productArray[i].toString() + "\n--------\n";
        }
        return result;
    }
}

