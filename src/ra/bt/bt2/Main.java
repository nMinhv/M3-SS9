package ra.bt.bt2;

public class Main {
    public static void main(String[] args) {
        Colorable[] shapes = new Colorable[4];
        shapes[0] = new Square(15.0);
        shapes[1] = new Square(20.0);
        shapes[2] = new Square(25);
        shapes[3] = new Square(30);

        System.out.println(shapes[0].getArea());
        shapes[0].howToColor();

        System.out.println(shapes[1].getArea());
        shapes[1].howToColor();
        System.out.println(shapes[2].getArea());
        shapes[2].howToColor();
        System.out.println(shapes[3].getArea());
        shapes[3].howToColor();

    }
}
