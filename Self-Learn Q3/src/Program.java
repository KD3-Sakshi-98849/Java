
import java.util.ArrayList;
import java.util.List;

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    public void sound() {
        System.out.println("Animal makes sound");
    }
}

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Lion roars");
    }
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Elephant trumpets");
    }
}

class Zoo {
    private String zooName;
    private List<Animal> animals;

    public Zoo(String zooName) {
        this.zooName = zooName;
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void displayZoo() {
        System.out.println("Zoo Name : " + zooName);

        for (Animal animal : animals) {
            animal.display();
            animal.sound();
            System.out.println();
        }
    }
}

public class Program {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Rajiv Gandhi Zoo");

        Animal lion = new Lion("Simba", 5);
        Animal elephant = new Elephant("Raja", 10);

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);

        zoo.displayZoo();
    }
}
