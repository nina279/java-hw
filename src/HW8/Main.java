package HW8;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        RightTriangle rightTriangle = new RightTriangle(5, 10);
        System.out.println("Right Triangle Area: " + rightTriangle.area());
        System.out.println("Right Triangle Perimeter: " + rightTriangle.perimeter());


        Square square = new Square(5);
        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());

    }
}
