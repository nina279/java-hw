package HW88;

abstract class Animals {
    String name;
    String habitat;

    public Animals(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    abstract void eat();
}
