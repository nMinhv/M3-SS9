package ra.bt.bt1;

public class Main {
    public static void main(String[] args) {
        // circle
        Circle circle = new Circle(10);
        System.out.println("before");
        circle.area();
        circle.perimeter();
        circle.resize(Math.random() * 100);
        System.out.println("After");
        circle.area();
        circle.perimeter();
        // rectangle
        Rectangle rectangle = new Rectangle(10,5);
        System.out.println("Before");
        rectangle.area();
        rectangle.perimeter();
        System.out.println("after");
        rectangle.resize(Math.random() * 100);
        rectangle.area();
        rectangle.perimeter();
        // square
        Square square = new Square(10);
        System.out.println("Before");
        square.area();
        square.perimeter();
        System.out.println("after");
        square.resize(Math.random() * 100);
        square.area();
        square.perimeter();
    }
}
