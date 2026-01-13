import java.util.Scanner;
public class factorial {
    public static void main(String[]args){
        int num,i=1;
        int fact=1;
        int sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        while(i<=num){
          fact=fact*num;
       num--;
    
        }
        System.out.println(fact);
    }
    
}
