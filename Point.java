package lab8.ex4;

public class Point {
    private float x;
    private float y;

    public Point(){
        this.x= 0.0f;
        this.y=0.0f;
    }
    public Point(float x , float y){
        this.x= x;
        this.y= y;
    }

    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        float[] resuilt = new float[2];
        resuilt[0]=this.x;
        resuilt[1]=this.y;
        return resuilt;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}
