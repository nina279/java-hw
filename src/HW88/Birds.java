package HW88;

public class Birds extends Animals implements Movable, Swimable, Vocable {
    public Birds (String name, String habitat) {
        super(name, habitat);
    }

    @Override
    void eat() {
        System.out.println(name + " eats grain and warms");
    }


    @Override
    public void move () {
        System.out.println(name + " walks");

    }

    @Override
    public void swim() {
        System.out.println(name + " swims");
    }

    @Override
    public void sound() {
        System.out.println(name + " says ga ga ga");
    }

    void fly() {

    }
}
