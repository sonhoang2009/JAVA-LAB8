package lab8.EX2;

public class TestStaff {
    public static void main(String[] args) {
        Staff t1 = new Staff();
        System.out.println(t1);


        Staff t2 = new Staff("FPT School",900);
        System.out.println(t2);


        t2.setAddress("ABCXYZP");
        t2.setSchool("Fpt School");
        t2.setPay(1000);
        System.out.println(t2);
    }

}
