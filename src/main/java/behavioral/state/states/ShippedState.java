package behavioral.state.states;

import behavioral.state.models.Order;

public class ShippedState implements OrderState{
    @Override
    public void process(Order order) {
        System.out.println(order.getId() + " ID'li sipariş kargoya verildi.");
        changeState(order);
    }

    @Override
    public void changeState(Order order) {
        order.setOrderState(new DeliveredState());
    }
}
