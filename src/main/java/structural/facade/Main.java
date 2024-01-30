package structural.facade;

import structural.facade.facades.OrderFacade;
import structural.facade.logging.FileLogger;
import structural.facade.services.implementations.CustomerServiceImpl;
import structural.facade.services.implementations.OrderServiceImpl;
import structural.facade.services.implementations.PaymentServiceImpl;
import structural.facade.services.implementations.ProductServiceImpl;

public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade(new CustomerServiceImpl(), new OrderServiceImpl(), new PaymentServiceImpl(), new ProductServiceImpl(), new FileLogger());
        orderFacade.processOrder();
    }
}
