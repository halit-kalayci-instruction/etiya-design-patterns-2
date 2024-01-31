package behavioral.command;

import behavioral.command.commands.CreateOrderCommand;
import behavioral.command.commands.OrderCommand;
import behavioral.command.commands.OrderCommandHandler;

public class Main {
    public static void main(String[] args) {
        CreateOrderCommand command = new CreateOrderCommand(1);
        OrderCommandHandler<CreateOrderCommand> createOrderCommandHandler = new CreateOrderCommand.CreateOrderCommandHandler();
        createOrderCommandHandler.execute(command);
    }
}
// CQRS => Command Query Responsibility Segregation