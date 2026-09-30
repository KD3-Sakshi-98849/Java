abstract class Shape {
    // Common method for all shapes
    public abstract void area();
    public abstract void volume();
}

// 2D Shape
abstract class Shape2D extends Shape {
    // 2D shapes have area but no volume
    @Override
    public abstract void volume();
}

// 3D Shape
abstract class Shape3D extends Shape {
    // 3D shapes have both area and volume
    @Override
    public abstract void area();

    @Override
    public abstract void volume();
}

// Circle
class Circle extends Shape2D {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Circle Area = " + result);
    }

    @Override
    public void volume() {
        System.out.println("Circle has no volume");
    }
}

// Rectangle
class Rectangle extends Shape2D {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        double result = length * width;
        System.out.println("Rectangle Area = " + result);
    }

    @Override
    public void volume() {
        System.out.println("Rectangle has no volume");
    }
}

// Sphere
class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double result = 4 * Math.PI * radius * radius;
        System.out.println("Sphere Surface Area = " + result);
    }

    @Override
    public void volume() {
        double result = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.println("Sphere Volume = " + result);
    }
}

// Cube
class Cube extends Shape3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public void area() {
        double result = 6 * side * side;
        System.out.println("Cube Surface Area = " + result);
    }

    @Override
    public void volume() {
        double result = side * side * side;
        System.out.println("Cube Volume = " + result);
    }
}

public class Program {
    public static void main(String[] args) {

        // Parent reference -> Child object
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(10, 5);
        Shape s3 = new Sphere(5);
        Shape s4 = new Cube(4);

        System.out.println("Circle:");
        s1.area();
        s1.volume();

        System.out.println("\nRectangle:");
        s2.area();
        s2.volume();

        System.out.println("\nSphere:");
        s3.area();
        s3.volume();

        System.out.println("\nCube:");
        s4.area();
        s4.volume();
    }
}
