package HW1;


public class Main {
    public static void main(String[] args) {
        Product product = new Product();

        product.setType("Milk");
        product.setBrand("Prostokwasha");
        product.setManufacturer("UK");
        product.setWeight(450);
        product.setPrice(18);
        product.setProductLife(5);

        System.out.println(product.toString());


    }
}
