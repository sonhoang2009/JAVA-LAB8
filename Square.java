package lab8.ex5;

public class Square extends  Rectangle {
    double side;

    public Square(){
        super();
        this.side = 1.0;
    }
    public Square(double side){
        super(side, side);
        this.side =side;
    }
    public Square(String color , boolean filled, double side){
        super(color,filled,side,side);
        this.side = side;
    }

    public double getArea(){
        return side*side;
    }

    public double getPeimeter(){
        return (side+side)*2;
    }

    @Override
    public String toString() {
        return "Square{" + super.toString() + "side=" + side + "} ";
    }
}
