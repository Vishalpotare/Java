import java.util.Scanner;

public class Recursneon {
    public static int sum(int num,int sum){
        int rem;
        if(num==0){
            return sum;
        }
        rem=num%10;
        sum=sum+rem;
        return sum(num/10,sum);

    }
   public static boolean neon(int num){
    return num == sum(num*num,0);
   }
   public static void main(String[] args) {
       int num;
       Scanner sc=new Scanner(System.in);
       num=sc.nextInt();
       int sun=sum(num,0);
       System.out.println(sun);
   }
    
}
