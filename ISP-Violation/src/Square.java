public class Square implements Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException("Not supported volume.");
    }
}
