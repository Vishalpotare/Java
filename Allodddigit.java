import java.util.Scanner;
public class Allodddigit {
    public static void main(String[] args) {
        int num;
        int sum=0;
        int rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        while(num>0){
            rem=num%10;
            if(rem%2!=0){
                sum=sum+rem;
            }
            num=num/10;
        }
        System.out.println(sum);

    }
    
}
    

