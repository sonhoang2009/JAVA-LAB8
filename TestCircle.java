package lab8.ex5;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(5.0);
        System.out.println("Color of Cicle is "+ c2.getColor());
        System.out.println("filled is "+ c2.isFilled());
        System.out.println("Area is "+c2.getArea());
        System.out.println("Permeter is "+c2.getPeimeter());
    }
}
