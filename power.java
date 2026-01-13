import java.util.Scanner;
public class power {
public static void main(String[] args) {
  int i=1;  
  int base;
    int exponent;
    int sum=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the base");
    base=sc.nextInt();
    System.out.println("Enter the exponent");
    exponent=sc.nextInt();
    while(i<=exponent){
      sum=sum*base;
      exponent--;
    }
    System.out.println(sum);

}
}
