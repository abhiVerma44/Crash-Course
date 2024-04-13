// Shape class
public class Shape {
    public void draw() {
        System.out.println("Drawing Shape");
    }
}

// Circle class extending Shape
 class Circle extends Shape {
    private double radius;

    // Overloaded draw method for Circle
    public void draw(double radius) {
        this.radius = radius;
        System.out.println("Drawing Circle with radius " + radius);
    }
}

// Rectangle class extending Shape
 class Rectangle extends Shape {
    private double length;
    private double breadth;

    // Overloaded draw method for Rectangle
    public void draw(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Drawing Rectangle with length " + length + " and breadth " + breadth);
    }
}

class Main {
    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        // Drawing shapes
        circle.draw(); // Output: Drawing Shape
        circle.draw(5.0); // Output: Drawing Circle with radius 5.0
        rectangle.draw(); // Output: Drawing Shape
        rectangle.draw(4.0, 3.0); // Output: Drawing Rectangle with length 4.0 and breadth 3.0
    }
}
