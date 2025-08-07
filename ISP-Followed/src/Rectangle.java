public class Rectangle implements TwoDimensionalShape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double area() {
        return length * width;
    }
}
