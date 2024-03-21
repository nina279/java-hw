package HW8;

class Quadrilateral extends Shape {
    protected double side1;
    protected double side2;
    protected double side3;
    protected double side4;

    Quadrilateral(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }
}

// Клас для квадрата
class Square extends Quadrilateral {
    Square(double side) {
        super(side, side, side, side);
    }

    @Override
    double area() {
        return side1 * side1;
    }

    @Override
    double perimeter() {
        return 4 * side1;
    }
}

// Клас для прямокутника
class Rectangle extends Quadrilateral {
    Rectangle(double length, double width) {
        super(length, width, length, width);
    }

    @Override
    double area() {
        return side1 * side2;
    }

    @Override
    double perimeter() {
        return 2 * (side1 + side2);
    }
}

// Клас для паралелограма
class Parallelogram extends Quadrilateral {
    private double height;

    Parallelogram(double base, double side, double height) {
        super(base, side, base, side);
        this.height = height;
    }

    @Override
    double area() {
        return side1 * height;
    }

    @Override
    double perimeter() {
        return 2 * (side1 + side2);
    }
}

// Клас для трапеції
class Trapezoid extends Quadrilateral {
    private double height;

    Trapezoid(double base1, double base2, double side1, double side2, double height) {
        super(base1, base2, side1, side2);
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * (side1 + side2) * height;
    }

    @Override
    double perimeter() {
        return side1 + side2 + side3 + side4;
    }
}

// Клас для ромба
class Rhombus extends Quadrilateral {
    private double diagonal1;
    private double diagonal2;

    Rhombus(double side, double diagonal1, double diagonal2) {
        super(side, side, side, side);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    double area() {
        return 0.5 * diagonal1 * diagonal2;
    }

    @Override
    double perimeter() {
        return 4 * side1;
    }
}
