import java.util.Scanner;
public class vishneon {
    public static boolean neon(int num){
        int temp;
        temp=num;
        int square;
        int rem;
        int sum=0;
        square =num*num;
        while(square>0){
            rem=square%10;
            sum=sum+rem;
            square=square/10;
        }
        if(temp==sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        num=sc.nextInt();
        boolean neo=neon(num);
        System.out.println(neo);
    }
    
}
