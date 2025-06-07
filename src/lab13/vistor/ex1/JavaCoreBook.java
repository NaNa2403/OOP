package lab13.vistor;

public class JavaCoreBook implements ProgramingBook {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getResource() {
        return "Java Core Book Resource";
    }

    public String getFavouriteBook() {
        return "Effective Java";
    }
}
