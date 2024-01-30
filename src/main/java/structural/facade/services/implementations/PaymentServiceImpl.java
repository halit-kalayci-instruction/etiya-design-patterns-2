package structural.facade.services.implementations;

import structural.facade.services.PaymentService;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public boolean makePayment() {
        System.out.println("Payment başarılı.");
        return true;
    }
}
