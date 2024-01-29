package com.etiya.demo.factories;

import com.etiya.demo.services.AdvancedProductService;
import com.etiya.demo.services.BasicProductService;
import com.etiya.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceFactory {

    @Autowired
    private ApplicationContext context;

    public ProductService createProductService(String type)
    {
        if(type.equals("basic"))
            return context.getBean(BasicProductService.class); // BasicProductService
        else if (type.equals("advanced"))
            return context.getBean(AdvancedProductService.class);//
        else
            throw new IllegalArgumentException();
    }
}
