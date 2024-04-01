package HW88;

public class Main {
    public static void main(String[] args) {
        Fish pike = new Fish("pike", "water");
        Fish carp = new Fish("carp", "water");
        Fish catfish = new Fish("catfish", "water");

        Pets cat = new Pets("cat", "home");
        Pets dog = new Pets("dog", "home");
        Pets hamster = new Pets("hamster", "cage");

        Birds eagle = new Birds("eagle", "wild nature") {
            @Override
            public void swim() {
                System.out.println(name + " doesn't swim, it's an eagle!");
            }
        };

        Birds stork = new Birds("stork", "wild nature");
        Birds dove = new Birds("dove", "wild nature");

        Aircraft plane = new Aircraft("Plane");

        Automobile car = new Automobile("Car");

        pike.swim();
        pike.sound();
        pike.move();
        pike.eat();

        carp.swim();
        carp.sound();
        carp.move();
        carp.eat();

        catfish.swim();
        catfish.sound();
        catfish.move();
        catfish.eat();

        cat.swim();
        cat.move();
        cat.eat();
        cat.sound();

        dog.swim();
        dog.move();
        dog.eat();
        dog.sound();

        hamster.swim();
        hamster.move();
        hamster.eat();
        hamster.sound();

        eagle.swim();
        eagle.move();
        eagle.eat();
        eagle.sound();

        eagle.sound();
        eagle.move();
        eagle.eat();

        stork.swim();
        stork.sound();
        stork.move();
        stork.eat();

        dove.swim();
        dove.sound();
        dove.move();
        dove.eat();

        plane.start();
        plane.move();
        plane.fly();

        car.start();
        car.move();
        car.ground();
    }
}
