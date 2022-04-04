public class ShapeArea {
    public static void main(String[] args) {

        // Rectangle test
        double width = 5, length = 7;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area() + "\n");

        // Square test
        double side = 7;
        Shape square = new Square(side);
        System.out.println("Square length: " + side
                + "\nResulting area: " + square.area() + "\n");


        // Circle test
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
                + "\nResulting Area: " + circle.area() + "\n");
    }
}

interface Shape {
    public abstract double area();
}

class Rectangle implements Shape {
    private final double width, length; //sides

    public Rectangle() {
        this(1,1);
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }
}

class Square implements Shape {
    private final double length;

    public Square() {
        this(1);
    }
    public Square(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return length * length;
    }
}

class Circle implements Shape {
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(1);
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi * Math.pow(radius, 2);
    }
}
