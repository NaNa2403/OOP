package lab13.vistor;

import lab6.part1.ex2.Person;

public interface Visitor {
    public void visit(BusinessBook book);
    public void visit(DesignPatternBook book);
    public void visit(JavaCoreBook book);
}
