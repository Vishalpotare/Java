import java.util.Scanner;
public class Areas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the radious of circle");
        int r=sc.nextInt();
        double c;
        c =3.14*r*r;
       System.out.println("Area of Circle =" +c);
   
   
       System.out.println("Enter the side of square");
       int b=sc.nextInt();
       double a;
       a=b*b;
       System.out.println("Area of Square="+a);

    }
    
}


