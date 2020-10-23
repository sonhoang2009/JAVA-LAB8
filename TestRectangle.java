package lab8.ex5;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);

        Rectangle r2 = new Rectangle(7.0,8.0);
        System.out.println("Color of Rectangle is "+r2.getColor());
        System.out.println("Filled is "+r2.isFilled());
        System.out.println("Area is "+r2.getArea());
        System.out.println("Permeter is "+ r2.getPeimeter());
    }
}
