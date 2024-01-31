package behavioral.state.states;

import behavioral.state.models.Order;

public class DeliveredState implements OrderState{
    @Override
    public void process(Order order) {
        System.out.println(order.getId() + " idli sipariş teslim edildi.");
        changeState(order);
    }

    @Override
    public void changeState(Order order) {
        // son state..
    }
}
