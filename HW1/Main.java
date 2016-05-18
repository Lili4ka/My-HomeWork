package HW1;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();

        product.setType("Milk");
        System.out.println("type:" + product.getType());
        product.setBrand("Prostokwasha");
        System.out.println("brand:" + product.getBrand());
        product.setManufacturer("UK");
        System.out.println("manufacturer:" + product.getManufacturer());
        product.setWeight(450);
        System.out.println("weight:" + product.getWeight());
        product.setPrice(18);
        System.out.println("price:" + product.getPrice());

        System.out.println(product.toString());


    }
}
