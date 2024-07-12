// Abstract class Shape
abstract class Shape {
    protected int width;
    protected int height;
        // Abstract method to be implemented by subclasses
    public abstract void printArea();
}
// Rectangle class extending Shape
class Rectangle extends Shape { 
    // Constructor
    public Rectangle(int width, int height) {
this.width = width;
this.height = height;
    }
    // Implementation of printArea method for Rectangle
    public void printArea() {
        int area = width * height;
System.out.println("Area of Rectangle: " + area);
}
}
// Triangle class extending Shape
class Triangle extends Shape { 
    // Constructor
    public Triangle(int width, int height) {
this.width = width;
this.height = height;
    }  	
    // Implementation of printArea method for Triangle
    public void printArea() {
        double area = 0.5 * width * height;
System.out.println("Area of Triangle: " + area);
    }
}
// Circle class extending Shape
class Circle extends Shape {
    private final double PI = 3.14;
    private int radius;
    // Constructor
    public Circle(int radius) {
this.radius = radius;
    }
    // Implementation of printArea method for Circle
    public void printArea() {
        double area = PI * radius * radius;
System.out.println("Area of Circle: " + area);
    }
}
// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of Rectangle, Triangle, and Circle
        Rectangle rectangle = new Rectangle(5, 4);
        Triangle triangle = new Triangle(6, 8);
        Circle circle = new Circle(3);      
        // Printing areas of shapes
rectangle.printArea();
triangle.printArea();
circle.printArea();
    }
}
