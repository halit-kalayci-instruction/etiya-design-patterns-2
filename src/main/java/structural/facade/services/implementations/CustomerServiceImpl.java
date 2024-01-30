package structural.facade.services.implementations;

import structural.facade.services.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public Object getCustomer() {
        return "customer1";
    }
}
