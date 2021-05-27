package lab11;

public class Triangle extends Geometric_shape {
    int height;
    int base;
    public Triangle(int height,int base){
        this.base=base;
        this.height=height;
    }

    @Override
    public double area() {
        return (height*base)/2;
    }
}