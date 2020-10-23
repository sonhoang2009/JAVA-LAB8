package lab8.ex5;

public class Circle extends  Shape{
    private double radius;

    public Circle (){
        super();
        this.radius = 1.0;
    }
    public Circle (double radius){
        super();
        this.radius = radius;
    }
    public Circle (String color, boolean filled , double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius *Math.PI;
    }

    public double getPeimeter(){
        return 2*radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{"+ super.toString() + "radius=" + radius + "} " ;
    }
}
