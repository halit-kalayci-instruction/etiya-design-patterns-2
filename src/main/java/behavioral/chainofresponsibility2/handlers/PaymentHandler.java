package behavioral.chainofresponsibility2.handlers;

import behavioral.chainofresponsibility2.models.Order;

public class PaymentHandler implements OrderHandler{
    private OrderHandler nextHandler;
    @Override
    public void process(Order order) {
        if(order.price > 200)
            throw new RuntimeException("Ödeme hatası");

        System.out.println("Ödeme başarılı.. Sonraki adıma geçiliyor..");
        if(nextHandler!=null)
            nextHandler.process(order);
    }

    @Override
    public void setNextChain(OrderHandler orderHandler) {
        this.nextHandler=orderHandler;
    }
}
