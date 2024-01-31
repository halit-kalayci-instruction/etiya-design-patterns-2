package behavioral.command.commands;

public class CreateOrderCommand implements OrderCommand{
    private int customerId;

    public int getCustomerId() {
        return customerId;
    }

    public CreateOrderCommand(int customerId) {
        this.customerId = customerId;
    }

    public static class CreateOrderCommandHandler implements OrderCommandHandler<CreateOrderCommand> {
        // dependencies..

        @Override
        public void execute(CreateOrderCommand command) {
            System.out.println(command.getCustomerId()+" müşterisi için sipariş oluşturuldu..");
        }
    }
}
