package structural.proxy.services;

import structural.proxy.proxies.ExampleServiceProxy;

public class ProductServiceImpl implements ProductService{
    private ExampleServiceProxy exampleServiceProxy;

    public ProductServiceImpl(ExampleServiceProxy exampleServiceProxy) {
        this.exampleServiceProxy = exampleServiceProxy;
    }

    @Override
    public void add() {

    }

    @Override
    public int calculate(int number) {
        return exampleServiceProxy.getDataWithProxy(number);
    }
}
