package lab8.ex7;

public class BigDog extends Dog {
    public BigDog() {}

    @Override
    public void greeting() {
        System.out.println("Woow");
    }

    @Override
    public void greeting(Dog another){
        System.out.println("Wooooowwwww");;
    }

    public void greeting(BigDog another){
        System.out.println("Woooooooooooowwwwwwww");
    }
}
