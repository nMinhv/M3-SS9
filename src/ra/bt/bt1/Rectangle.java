package ra.bt.bt1;

public class Rectangle implements Resizeable{
    private double dai;
    private double rong;

    public Rectangle() {
    }

    public Rectangle(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    @Override
    public void resize(double percent) {
        this.dai = this.dai *(1 + percent/100);
        this.rong = this.rong *(1 + percent/100);
    }

    @Override
    public void area() {
        System.out.println(this.dai*this.rong);
    }

    @Override
    public void perimeter() {
        System.out.println((this.dai + this.rong) * 2);
    }
}
