package behavioral.chainofresponsibility2.handlers;

import behavioral.chainofresponsibility2.models.Order;

public class StockHandler implements OrderHandler{
    private OrderHandler nextHandler;

    @Override
    public void process(Order order) {
        if(!order.isInStock)
            throw new RuntimeException("Sipariş edilecek ürün stokta yok.");

        System.out.println("Stok kontrol mekanizması çalıştı.. Sonraki adıma geçiliyor..");
        if(nextHandler!=null)
            nextHandler.process(order);
    }

    @Override
    public void setNextChain(OrderHandler orderHandler) {
        this.nextHandler = orderHandler;
    }
}
