package behavioral.state.states;

import behavioral.state.models.Order;

public interface OrderState
{
    void process(Order order);
    void changeState(Order order);
}
