package behavioral.chainofresponsibility2.patterns;

import behavioral.chainofresponsibility2.handlers.OrderHandler;
import behavioral.chainofresponsibility2.handlers.PaymentHandler;
import behavioral.chainofresponsibility2.handlers.ShippingHandler;
import behavioral.chainofresponsibility2.handlers.StockHandler;
import behavioral.chainofresponsibility2.models.Order;

public class OrderChainPattern {
    public static OrderHandler orderChain() {
        OrderHandler stockHandler = new StockHandler();
        OrderHandler paymentHandler = new PaymentHandler();
        OrderHandler shippingHandler = new ShippingHandler();

        stockHandler.setNextChain(paymentHandler);
        paymentHandler.setNextChain(shippingHandler);
        return stockHandler;
    }
}
