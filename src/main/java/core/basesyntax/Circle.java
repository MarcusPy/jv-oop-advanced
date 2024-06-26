package core.basesyntax;

public class Circle extends Figure {
    private final double radius;
    private final String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.printf("Figure: %s, Area: %f sq. units, Radius: %f units, Color: %s\n",
                this.getClass().getSimpleName(), calculateArea(), radius, color);
    }
}
