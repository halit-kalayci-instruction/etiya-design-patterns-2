package com.etiya.demo.controllers;

import com.etiya.demo.factories.ProductServiceFactory;
import com.etiya.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    private ProductServiceFactory productServiceFactory;

    @Autowired
    public ProductsController(ProductServiceFactory productServiceFactory) {
        this.productServiceFactory = productServiceFactory;
    }

    public void add() {
        this.productServiceFactory.createProductService("advanced").add();
    }
}
