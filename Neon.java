import java.util.Scanner;
public class Neon {
    public static void main(String[] args) {
        int num;
        int rem;
        int sum=0;
        int temp;
        int square;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        temp=num;
        square=num*num;
        while(square>0){
            rem=square%10;
            sum=sum+rem;
            square=square/10;
        }
        if(temp==sum){
            System.out.println("number is neon");
        }
        else{
            System.out.println("number is not neon");
        }


    }
    
}
