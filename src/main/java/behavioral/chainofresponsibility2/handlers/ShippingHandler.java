package behavioral.chainofresponsibility2.handlers;

import behavioral.chainofresponsibility2.models.Order;

public class ShippingHandler implements OrderHandler{
    private OrderHandler nextHandler;
    @Override
    public void process(Order order) {
        System.out.println("Sipariş için kargo başlatıldı..");

        if(nextHandler!=null)
            nextHandler.process(order);
    }

    @Override
    public void setNextChain(OrderHandler orderHandler) {
        this.nextHandler=orderHandler;
    }
}
