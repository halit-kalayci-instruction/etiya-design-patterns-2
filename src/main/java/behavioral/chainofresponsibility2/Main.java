package behavioral.chainofresponsibility2;

import behavioral.chainofresponsibility2.models.Order;
import behavioral.chainofresponsibility2.patterns.OrderChainPattern;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.price = 150;
        order.isInStock = true;

        OrderChainPattern.orderChain().process(order);
    }
}
