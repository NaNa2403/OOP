package lab6.part1.ex5;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Bird");
        System.out.println(animal);

        Mammal mammal = new Mammal("Bat");
        System.out.println(mammal);

        Cat cat = new Cat("Miu");
        System.out.println(cat);
        cat.greets();

        Dog dog1 = new Dog("Dog 1");
        Dog dog2 = new Dog("Dog 2");
        System.out.println(dog1);
        dog1.greets();
        dog1.greets(dog2);
    }
}
