package ra.bt.bt1;

public class Circle implements Resizeable {
    @Override
    public void resize(double percent) {
        this.r = this.r * (1 + percent / 100);
    }
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public  void area() {
        System.out.println(r*r*PI);
    }

    @Override
    public void perimeter() {
        System.out.println(r*2*PI);
    }

    private final double PI = 3.14;
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }

}
