/**
 * Created by Admin on 23.02.2016.
 */
public class Main {
    public static void main(String[] args) {

        Shop prodShop = new Shop();
        prodShop.setName("City Music");
        prodShop.setAddress("Shevchenko Boulevard,2);
        prodShop.setNumberProductOrder(2);

        Product product = new Product();
        product.setType("toy");
        product.setManufacturer("China");
        product.setWeight("204");
        product.setDateOfManufacture("21.02.16");
        prodShop.addProduct(product);

        Product product1 = new Product();
        product1.setType("dairy produce");
        product1.setBrand("Buttermilk");
        product1.setManufacturer("UK");
        product1.setWeight ("250");
        product1.setDateOfManufacture("23.02.16");
        product1.setDateOfExpiration("5");
        prodShop.addProduct(product);

        System.out.println(prodShop.toString());
    }
}

