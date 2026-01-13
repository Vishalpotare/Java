import java.util.Scanner;
public class Recursharshad {
    public static int harshad(int num,int sum) {
        int rem;
        if(num==0){
            return sum;
        }
        rem=num%10;
        sum=sum+rem;
        return harshad(num/10,sum);
    }
    public static boolean isharshad(int num){
    return num % harshad(num,0)==0;
    }
        public static void main(String[]args){
            int num;
            int sum;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Number");
            num=sc.nextInt();
            boolean harsh=isharshad(num);
            System.out.println(harsh);
        }
    }
    
