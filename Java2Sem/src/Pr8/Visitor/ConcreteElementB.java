package Pr8.Visitor;

public class ConcreteElementB implements Element {

    private String greetings;

    public ConcreteElementB(String greetings) {
        this.greetings = greetings;
    }

    @Override
    public void accept() {
        System.out.println("in elem B. " + greetings);
    }
}
