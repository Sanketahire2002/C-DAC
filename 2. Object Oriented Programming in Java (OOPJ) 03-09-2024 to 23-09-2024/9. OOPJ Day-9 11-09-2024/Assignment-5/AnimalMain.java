class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(getName() + " is barking.");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        Dog dog = new Dog("Baby Animal");

        animal.eat();
        animal.sleep();

        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
