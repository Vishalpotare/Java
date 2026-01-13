import java.util.Scanner;
public class while9 {
    public static void main(String[] args) {
  int num;
  int fact=1;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter number");
  num=sc.nextInt();
  while(num>=1){
    fact=fact*num;
    num--;
    

  }
  System.out.println(fact);
    }
    
}
