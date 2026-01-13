import java.util.Scanner;
public class visharmstrong {
    public static boolean  armstrong(int num) {
        int sum=0;
        int cube;
        int temp=num;
        int rem;
        while(num>0){
            rem=num%10;
            cube=rem*rem*rem;
            sum=sum+cube;
            num=num/10;
        }
        if(sum==temp){
           return true;
        }
        return false;


            
    }
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        num=sc.nextInt();
        boolean armst=armstrong(num);
        System.out.println(armst);
    }
    
}
