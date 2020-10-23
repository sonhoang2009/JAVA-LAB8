package lab8.ex5;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        super();
        this.length =1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width){
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color , boolean filled ,double length, double width ){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return width* length;
    }

    public double getPeimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" + super.toString() +"width=" + width + ", length=" + length + "} " ;
    }
}
