package structural.facade.facades;

import structural.facade.logging.Logger;
import structural.facade.services.CustomerService;
import structural.facade.services.OrderService;
import structural.facade.services.PaymentService;
import structural.facade.services.ProductService;

//@Component
public class OrderFacade {
    private CustomerService customerService;
    private OrderService orderService;
    private PaymentService paymentService;
    private ProductService productService;
    private Logger logger;

    // Spring IoC
    public OrderFacade(CustomerService customerService, OrderService orderService, PaymentService paymentService, ProductService productService, Logger logger) {
        this.customerService = customerService;
        this.orderService = orderService;
        this.paymentService = paymentService;
        this.productService = productService;
        this.logger = logger;
    }

    public void processOrder(){
        customerService.getCustomer();
        productService.checkProductStocks();
        paymentService.makePayment();
        orderService.saveOrder();
        logger.log("Sipariş alındı..");
    }
}