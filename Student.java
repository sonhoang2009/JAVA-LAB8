package lab8.EX2;

public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(){
        super();
        this.program = "";
        this.year = 0;
        this.fee = 0;
    }
    public Student(String program , int year , double fee){
        super();
        this.program = program;
        this.year = year;
        this.fee =fee;
    }
    public Student(String name , String address , String program , int year, double fee){
        super(name,address);
        this.program = program;
        this.year = year;
        this.fee =fee;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    public String getProgram() {
        return program;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    public double getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Student " + super.toString() +
                " program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                " " ;
    }
}
