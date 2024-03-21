package HW8;

class Triangle extends Shape {
    protected double side1;
    protected double side2;
    protected double side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}

// Клас для прямокутного трикутника
class RightTriangle extends Triangle {
    RightTriangle(double base, double height) {
        super(base, height, Math.sqrt(base*base + height*height));
    }

    @Override
    double area() {
        return 0.5 * side1 * side2;
    }

    @Override
    double perimeter() {
        return side1 + side2 + side3;
    }
}

// Клас для рівнобедренного трикутника
class IsoscelesTriangle extends Triangle {
    IsoscelesTriangle(double base, double side) {
        super(base, side, side);
    }

    @Override
    double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    double perimeter() {
        return side1 + side2 + side3;
    }
}

// Клас для рівностороннього трикутника
class EquilateralTriangle extends Triangle {
    EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    double area() {
        return (Math.sqrt(3) / 4) * side1 * side1;
    }

    @Override
    double perimeter() {
        return 3 * side1;
    }
}
