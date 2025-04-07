public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5.0, "Red"),
                new Rectangle(4.0, 6.0, "Blue"),
                new Triangle(3.0, 8.0, "Green")
        };

        System.out.println("Shape Calculator\n");

        for (Shape shape : shapes) {
            System.out.println(shape + " → Area: " + shape.calculateArea());
        }
    }
}
