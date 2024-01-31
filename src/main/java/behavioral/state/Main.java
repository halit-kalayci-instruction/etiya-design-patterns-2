package behavioral.state;

import behavioral.state.models.Order;
import behavioral.state.states.DeliveredState;
import behavioral.state.states.NewOrderState;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.setId(1);
        order.setOrderState(new NewOrderState());

        order.process();
        order.process();
        order.process();
    }
}
