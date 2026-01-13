 class student1{

    public static void dis() {
        System.out.println("A");
    }
}
 class student2 extends student1{            //single inheritance

}
public class student{
    public static void main(String[] args) {
        student2 s = new student2();
        s.dis();
    }
}
