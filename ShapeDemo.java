import java.util.Scanner;


class InputScanner {
    Scanner sc = new Scanner(System.in);
}


abstract class Shape extends InputScanner {
    int a, b; 
    abstract void printArea(); 
}


class Rectangle extends Shape {
    void input() {
        System.out.print("Enter length of rectangle: ");
        a = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        b = sc.nextInt();
    }

    void printArea() {
        System.out.println("Area of Rectangle = " + (a * b));
    }
}


class Triangle extends Shape {
    void input() {
        System.out.print("Enter base of triangle: ");
        a = sc.nextInt();
        System.out.print("Enter height of triangle: ");
        b = sc.nextInt();
    }

    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * a * b));
    }
}


class Circle extends Shape {
    void input() {
        System.out.print("Enter radius of circle: ");
        a = sc.nextInt();
    }

    void printArea() {
        System.out.println("Area of Circle = " + (Math.PI * a * a));
    }
}


public class ShapeDemo {
    public static void main(String[] args) {
   
        Rectangle rect = new Rectangle();
        Triangle tri = new Triangle();
        Circle cir = new Circle();

   
        System.out.println("\n--- Rectangle ---");
        rect.input();
        rect.printArea();

        System.out.println("\n--- Triangle ---");
        tri.input();
        tri.printArea();

        System.out.println("\n--- Circle ---");
        cir.input();
        cir.printArea();
    }
}
