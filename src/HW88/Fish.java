package HW88;

public class Fish extends Animals implements Swimable, Vocable, Movable {
    public Fish(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming in the water.");
    }

    @Override
    public void sound() {
        System.out.println(name + " says bloop.");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving slowly.");
    }

    @Override
    void eat() {
        System.out.println(name + " is eating algae.");
    }
}