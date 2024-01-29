package creational.builder;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        //product.id = 1;
        product.setId(1);
        product.setName("Ürün 1");
        product.setCategoryName("Kategori 1");
        product.setUnitPrice(100);

        Product product1 = new Product(1, "Ürün 2", 200, "Kategori 2");


        Product product2 = new Product.Builder().id(1).unitPrice(500).build();

        System.out.println("**");

    }
}
