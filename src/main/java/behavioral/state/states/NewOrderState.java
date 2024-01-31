package behavioral.state.states;

import behavioral.state.models.Order;

public class NewOrderState implements OrderState{
    @Override
    public void process(Order order) {
        System.out.println(order.getId() + " idli sipariş alındı.");
        changeState(order);
    }

    @Override
    public void changeState(Order order) {
       order.setOrderState(new ShippedState());
    }
}
