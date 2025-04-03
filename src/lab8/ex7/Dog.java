package lab8.ex7;

public class Dog extends Animal {
    public Dog() {
    }


    @Override
    public void greeting() {
        System.out.println("Woof");
    }

    public void greeting(Dog another) {
        System.out.println("Woooooof");
    }
}
