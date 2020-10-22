package lab8.EX2;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);

        Student s2 = new Student("aptech",5,100);
        System.out.println(s2);

        s1.setAddress("ABCXYZ");
        s1.setProgram("APTECH");
        s1.setYear(2);
        s1.setFee(500);
        System.out.println(s1);
    }
}
