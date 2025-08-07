import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TwoDimensionalShape> twoDimensionalShapes = new ArrayList<>();
        TwoDimensionalShape sq = new Square(23.2);
        TwoDimensionalShape rect  = new Rectangle(34.2, 23.2);
        List<ThreeDimensionalShape> threeDimensionalShapes = new ArrayList<>();
        ThreeDimensionalShape cube = new Cube(23);
        twoDimensionalShapes.add(sq);
        twoDimensionalShapes.add(rect);
        threeDimensionalShapes.add(cube);

        for (TwoDimensionalShape shape : twoDimensionalShapes) {
                System.out.println("Area : "+shape.area());
        }
        for (ThreeDimensionalShape shape : threeDimensionalShapes) {
            System.out.println("Area : "+shape.area());
            System.out.println("Volume : "+shape.volume());
        }

    }
}