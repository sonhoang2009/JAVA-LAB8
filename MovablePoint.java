package lab8.ex4;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;


    public MovablePoint(){
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }
    public MovablePoint(float x , float y ,float xSpeed , float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] resuilt = new float[2];
        resuilt[0]=this.xSpeed;
        resuilt[1]=this.ySpeed;
        return resuilt;
    }
    public void setSpeed(float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint" + super.toString() + " ,speed = ( "+ xSpeed +" , " + ySpeed+ " )";
    }
}
