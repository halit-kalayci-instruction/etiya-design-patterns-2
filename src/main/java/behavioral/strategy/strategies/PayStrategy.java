package behavioral.strategy.strategies;

import behavioral.strategy.models.Order;

public interface PayStrategy {
    boolean pay(Order order);
}
