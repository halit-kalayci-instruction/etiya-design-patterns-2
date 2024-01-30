package structural.facade.services.implementations;

import structural.facade.services.OrderService;

public class OrderServiceImpl implements OrderService {
    @Override
    public void saveOrder() {
        System.out.println("Order saved");
    }
}
