package behavioral.nullobject;

import behavioral.nullobject.logging.DatabaseLogger;
import behavioral.nullobject.logging.StubLogger;
import behavioral.nullobject.services.OrderService;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService(new DatabaseLogger());
        orderService.save();

        OrderService orderService1 = new OrderService(new StubLogger());
        orderService1.save();
    }
}
