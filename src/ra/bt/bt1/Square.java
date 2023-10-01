package ra.bt.bt1;

public class Square implements Resizeable{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    @Override
    public void resize(double percent) {
        this.side = this.side *(1 + percent/100);
    }


    @Override
    public void area() {

        System.out.println(side*side);
    }

    @Override
    public void perimeter() {
        System.out.println(side*4);
    }
}
