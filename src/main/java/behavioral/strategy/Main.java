package behavioral.strategy;

import behavioral.strategy.models.Order;
import behavioral.strategy.strategies.PayWithCreditCard;
import behavioral.strategy.strategies.PayWithPayPal;
import behavioral.strategy.strategies.PaymentContext;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.setTotalPrice(150);

        PaymentContext paymentContext = new PaymentContext(new PayWithCreditCard());
        paymentContext.executeStrategy(order);
    }
}
