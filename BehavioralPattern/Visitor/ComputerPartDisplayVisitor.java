public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    
    @Override
    public void visit(Computer computer) {
        System.out.println("Dislaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Dislaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Dislaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Dislaying Monitor.");
    }
}
