package lab8.EX2;

public class Persontest {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1);

        p1.setAddress("abc xyz");
        System.out.println(p1);

        p1.setAddress("ABCXYZ");
        System.out.println(p1);
    }
}
