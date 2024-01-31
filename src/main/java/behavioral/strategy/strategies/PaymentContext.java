package behavioral.strategy.strategies;

import behavioral.strategy.models.Order;

public class PaymentContext {
    private PayStrategy payStrategy;

    public PaymentContext(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public boolean executeStrategy(Order order)
    {
        return payStrategy.pay(order);
    }
}
