package lab11;

public class Circle extends Geometric_shape{
    private int radius;
    public Circle(int radius){
        this.radius=radius;
    }

    @Override
    public double area() {
        return 3.14*radius*radius;
    }
}
