package HW88;

abstract class Vehicle {
    String name;

    public Vehicle(String name) {
        this.name = name;
    }
    void start () {
        System.out.println(name + " is turned on");
    }
}


