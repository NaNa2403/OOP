package lab13.vistor;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[] {
                new BusinessBook(),
                new DesignPatternBook(),
                new JavaCoreBook()
        };

        Visitor visitor = new VisitorImp();
        for (Book book : books) {
            book.accept(visitor);
        }
    }
}

