package behavioral.nullobject.services;

import behavioral.nullobject.logging.Logging;

public class OrderService {
    private Logging logging;

    public OrderService(Logging logging) {
        this.logging = logging;
    }

    public void save() {
         this.logging.log("Order.Save");
    }
}
