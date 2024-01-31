package behavioral.strategy.strategies;

import behavioral.strategy.models.Order;

public class PayWithCreditCard implements PayStrategy{
    @Override
    public boolean pay(Order order) {
        System.out.println("Kredi kartı ile ödendi.");
        return true;
    }
}
