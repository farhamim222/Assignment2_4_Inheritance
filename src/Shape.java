public class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape (Color: " + color + ")";
    }
}

