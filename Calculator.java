import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     char ch;
     ch=sc.next().charAt(0);
        int a,b;
        System.out.println("Enter the number 1st ");
      a= sc.nextInt();

      System.out.println("Enter the number 2nd");
      b=sc.nextInt();
      if(ch=='+'){
    System.out.println(a+b);
    }else if(ch=='-'){
     System.out.println(a-b);
    }else if(ch=='*'){
     System.out.println(a*b);
    }else if(ch=='/'){
     System.out.println(a*b);
    }else if(ch=='%'){
     System.out.println(a*b);
    }
    


    }
}
