import java.util.Scanner;

abstract class Shape {
    int dim1, dim2;
    abstract void printArea();
}

// Rectangle
class Rectangle extends Shape {
    Rectangle(int l, int b) {
        dim1 = l;
        dim2 = b;
    }

    void printArea() {
        System.out.println("Area of Rectangle = " + (dim1 * dim2));
    }
}

// Triangle
class Triangle extends Shape {
    Triangle(int base, int height) {
        dim1 = base;
        dim2 = height;
    }

    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * dim1 * dim2));
    }
}

// Circle
class Circle extends Shape {
    Circle(int r) {
        dim1 = r;
    }

    void printArea() {
        System.out.println("Area of Circle = " + (Math.PI * dim1 * dim1));
    }
}

// Main class
class ShapeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Shape s;

        System.out.println("--- Rectangle ---");
        System.out.print("Enter length of rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int b = sc.nextInt();
        s = new Rectangle(l, b);
        s.printArea();

        System.out.println("\n--- Triangle ---");
        System.out.print("Enter base of triangle: ");
        int base = sc.nextInt();
        System.out.print("Enter height of triangle: ");
        int height = sc.nextInt();
        s = new Triangle(base, height);
        s.printArea();

        System.out.println("\n--- Circle ---");
        System.out.print("Enter radius of circle: ");
        int r = sc.nextInt();
        s = new Circle(r);
        s.printArea();
    }
}


