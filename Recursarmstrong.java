import java.util.Scanner;
public class Recursarmstrong{
    public static int armstrong(int num,int sum){
        int rem;
        int cube;
        if(num==0){
            return sum;
        }
            rem=num%10;
            cube=rem*rem*rem;
            sum=sum+cube;
            return armstrong(num/10,sum);
    }
    public static void main(String[]args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
        int arms=armstrong(num,0);
        System.out.println(arms);


        
    }}
    

