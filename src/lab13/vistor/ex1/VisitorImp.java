package lab13.vistor;

public class VisitorImp implements Visitor {
    @Override
    public void visit(BusinessBook book) {
        System.out.println("BusinessBook publisher: " + book.getPublisher());
    }

    @Override
    public void visit(DesignPatternBook book) {
        System.out.println("DesignPatternBook resource: " + book.getResource());
    }

    @Override
    public void visit(JavaCoreBook book) {
        System.out.println("JavaCoreBook favorite: " + book.getFavouriteBook());
    }
}
