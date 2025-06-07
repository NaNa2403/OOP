package lab13.vistor;

public class DesignPatternBook implements ProgramingBook{

    @Override
    public String getResource() {
        return "Design Pattern Resource Link";
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
