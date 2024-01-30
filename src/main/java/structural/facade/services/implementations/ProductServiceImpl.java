package structural.facade.services.implementations;

import structural.facade.services.ProductService;

public class ProductServiceImpl implements ProductService {
    @Override
    public boolean checkProductStocks() {
        System.out.println("Ürün stokları kontrol edildi.");
        return true;
    }
}
