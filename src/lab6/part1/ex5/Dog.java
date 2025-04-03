package lab6.part1.ex5;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void greets(){
        System.out.println("Woof");
    }

    public void greets(Dog another){
        System.out.println("Wooooooof");
    }

    @Override
    public String toString() {
        return "Dog{" +
                super.toString() +
                "}";
    }
}
