package HW88;

public class Automobile extends Vehicle implements Movable {
    public Automobile(String name) {
    super(name);
    }

    public void ground () {
        System.out.println(name + " goes on the ground");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving fast");
    }
}
