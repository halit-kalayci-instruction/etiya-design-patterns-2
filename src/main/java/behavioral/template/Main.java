package behavioral.template;

import behavioral.template.templates.DigitalProductTemplate;
import behavioral.template.templates.OrderProcessTemplate;
import behavioral.template.templates.PhysicalProductTemplate;

public class Main {
    public static void main(String[] args) {
        OrderProcessTemplate physicalProduct = new PhysicalProductTemplate();

        OrderProcessTemplate digitalProduct = new DigitalProductTemplate();

        physicalProduct.process();

        digitalProduct.process();
    }
}
