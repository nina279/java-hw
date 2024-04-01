package HW88;

public class Aircraft extends Vehicle implements Movable {

    public Aircraft (String name) {
        super(name);
    }

    public void fly () {
        System.out.println(name + " is flying");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving");
    }


}