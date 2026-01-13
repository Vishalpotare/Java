import java.util.Scanner;
public class Harshad {
    public static void main(String[]args){
        int num;
        int rem;
        int sum=0;
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
        temp=num;
        while(num>0){
            rem=num%10;
            sum=rem+sum;
            num=num/10;
        }
        if(temp%sum==0){
                System.out.println("Number is Harshad");
            }else{
                System.out.println("Number is not Harshad");
            }
        }

    }
    

