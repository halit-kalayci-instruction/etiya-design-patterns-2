package structural.proxy;

import structural.proxy.libraries.ExampleService;
import structural.proxy.proxies.ExampleServiceProxy;
import structural.proxy.services.ProductService;
import structural.proxy.services.ProductServiceImpl;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl(new ExampleServiceProxy());

        System.out.println(productService.calculate(5));
        System.out.println(productService.calculate(5));
        System.out.println(productService.calculate(6));
    }
}
