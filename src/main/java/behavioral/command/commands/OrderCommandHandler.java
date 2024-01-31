package behavioral.command.commands;

public interface OrderCommandHandler<T> {
    void execute(T command);
}
