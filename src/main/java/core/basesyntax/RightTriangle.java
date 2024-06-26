package core.basesyntax;

public class RightTriangle extends Figure {
    private final double sideA;
    private final double sideB;
    private final String color;

    public RightTriangle(double sideA, double sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return (sideA * sideB) / 2;
    }

    public void draw() {
        System.out.printf("Figure: %s, Area: %f sq. units, "
                        + "Side A: %f units, Side B: %f units, Color: %s\n",
                this.getClass().getSimpleName(), calculateArea(), sideA, sideB, color);
    }
}
