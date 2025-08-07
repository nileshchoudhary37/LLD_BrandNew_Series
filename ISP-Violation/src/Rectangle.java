public class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException("Not supported volume for Rectangle.");
    }
}
