package behavioral.command.commands;

public class UpdateOrderCommand implements OrderCommand
{
    private int id;
    private String customerId;

    public class UpdateOrderCommandHandler implements OrderCommandHandler<UpdateOrderCommand>{
        //private OrderRepository orderRepository;
        @Override
        public void execute(UpdateOrderCommand command) {
            System.out.println(command.id+"- Update işlemleri gerçekleşti..");
        }
    }
}
// 2- Command-Handler
