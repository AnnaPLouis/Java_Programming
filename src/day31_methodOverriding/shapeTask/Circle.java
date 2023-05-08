package day31_methodOverriding.shapeTask;

public class Circle extends Shape{

    public double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * 3.14;
    }

    @Override
    public double perimeter() {
        return 2 * radius * 3.14;
    }

    @Override
    public void draw() {

        System.out.println("   * *   ");
        System.out.println(" *     * ");
        System.out.println(" *     * ");
        System.out.println("   * *   ");

    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", radius=" + radius +
                '}';
    }
}
