package lab13.vistor;

public class BusinessBook implements Book {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getPublisher() {
        return "Business Publisher";
    }
}
