package lab8.ex6;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Hieu");
        cat1.greets();

        Dog dog1 = new Dog("Nghia");
        dog1.greets();

        Dog dog2 = new Dog("Thai");
        dog2.greets();
        dog2.greets(dog1);

        BigDog bigDog1 = new BigDog("Quy");
        bigDog1.greets();
        bigDog1.greets(dog1);

        BigDog bigDog2 = new BigDog("Nam");
        bigDog2.greets();
        bigDog1.greets(dog2);
        bigDog2.greets(bigDog1);
    }
}
