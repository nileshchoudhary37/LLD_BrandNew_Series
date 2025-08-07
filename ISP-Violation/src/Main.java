import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Shape sq = new Square(23.2);
        Shape rect  = new Rectangle(34.2, 23.2);
        Shape cube = new Cube(23);
        shapes.add(sq);
        shapes.add(rect);
        shapes.add(cube);

        for (Shape shape : shapes) {
            try {
                System.out.println("Area : "+shape.area());
                System.out.println("Volume: "+shape.volume());
            }catch (UnsupportedOperationException e){
                System.out.println(e.getMessage());
            }
        }

    }
}