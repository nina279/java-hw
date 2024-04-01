package HW88;

public class Pets extends Animals implements Swimable, Vocable, Movable {
    public Pets(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    void eat() {
        switch (name) {
            case "cat" -> System.out.println( name + " eats fish");
            case "dog" -> System.out.println(name + " eats meat");
            case "hamster" -> System.out.println(name + " eats grain");
            default -> System.out.println("Unknown pet");
        }
    }

    @Override
    public void move() {
        switch (name) {
            case "cat" -> System.out.println(name + " moves graciously");
            case "dog" -> System.out.println(name + " moves actively");
            case "hamster" -> System.out.println(name + " runs in a wheel");
            default -> System.out.println("Unknown pet");
        }
    }

    @Override
    public void swim() {
        if (name.equals("hamster")) {
            System.out.println(name + " doesn't swim");
        } else {
            System.out.println(name + " swims");
        }
    }

    @Override
    public void sound() {
        switch (name) {
            case "cat" -> System.out.println(name + " says meow");
            case "dog" -> System.out.println(name + " says woof");
            case "hamster" -> System.out.println(name + " says pe pe pe");
            default -> System.out.println("Unknown pet");
        }
    }
}
