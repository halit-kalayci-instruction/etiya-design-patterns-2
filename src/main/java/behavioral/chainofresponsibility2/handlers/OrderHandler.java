package behavioral.chainofresponsibility2.handlers;

import behavioral.chainofresponsibility2.models.Order;

public interface OrderHandler {
    void process(Order order);
    void setNextChain(OrderHandler orderHandler);
}
