package HW2;

import java.util.ArrayList;
import java.util.List;

public class ProductShop {
    protected String name;
    protected String address;
    protected List<Product> productsList = new ArrayList<>();

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

    public void addProduct(Product product) {
        productsList.add(product);
    }

    public void removeProduct(String productBrand) {
        for (Product product : productsList) {
            if (product.getBrand().equals(productBrand))
                productsList.remove(product);
        }
    }

    public void removeProduct(int productCode) {
        for (Product product : productsList) {
            if (product.getCode() == productCode)
                productsList.remove(product);
        }
    }

    public String toString() {
        String result = "You need to buy " + productsList.size() + " products for productshop " + this.name + " on address " + this.address + ":\n";
        for (Product product : productsList) {
            result = result + product.toString() + "\n-------------\n";
        }

        return result;
    }
}
