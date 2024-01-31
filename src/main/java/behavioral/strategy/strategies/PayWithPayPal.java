package behavioral.strategy.strategies;

import behavioral.strategy.models.Order;

public class PayWithPayPal implements PayStrategy{
    @Override
    public boolean pay(Order order) {
        System.out.println("Paypal ile ödendi.");
        return true;
    }
}
