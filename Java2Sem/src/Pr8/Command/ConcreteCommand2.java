package Pr8.Command;

public class ConcreteCommand2 implements Command {

    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.receiverMethod2();
    }
}
