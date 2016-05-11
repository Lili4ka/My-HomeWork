package HW2;

public class Main {
    public static void main(String[] args) {

        ProductShop productShop = new ProductShop();
        productShop.setName("Objorka");
        productShop.setAddress("Petra Doroshenka, 28");

        Product product1 = new Product("Prostokvasha", "Danone", "Ukraine", 450, 46070534);
        Product product2 = new Product("Rastishka","Danone", "Ukraine", 250, 48702064);
        Product product3 = new Product("Belvita","Belvita", "Chehiya",400, 46070535);

        productShop.addProduct(product1);
        productShop.addProduct(product2);
        productShop.addProduct(product3);
        System.out.println(productShop.toString());

        productShop.removeProduct("Rastishka");
        productShop.removeProduct(48702064);
        System.out.println(productShop.toString());
    }
}
