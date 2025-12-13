abstract class Shape {

    int dim1, dim2;

    // Abstract method
    abstract void printArea();
}

// Rectangle class
class Rectangle extends Shape {

    Rectangle(int length, int breadth) {
        dim1 = length;
        dim2 = breadth;
    }

    void printArea() {
        int area = dim1 * dim2;
        System.out.println("Area of Rectangle = " + area);
    }
}

// Triangle class
class Triangle extends Shape {

    Triangle(int base, int height) {
        dim1 = base;
        dim2 = height;
    }

    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle = " + area);
    }
}

// Circle class
class Circle extends Shape {

    Circle(int radius) {
        dim1 = radius;
    }

    void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Area of Circle = " + area);
    }
}

// Main class
class ShapeDemo {
    public static void main(String[] args) {

        Shape s;

        s = new Rectangle(10, 5);
        s.printArea();

        s = new Triangle(6, 4);
        s.printArea();

        s = new Circle(7);
        s.printArea();
    }
}
