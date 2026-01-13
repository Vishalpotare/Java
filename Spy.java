import java.util.Scanner;
public class Spy {
    public static void main(String[] args) {
    int num;
    int rem;
    int sum=0;
    int mul=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    num=sc.nextInt();
    while(num>0){
    rem=num%10;
    sum=sum+rem;
    mul=mul*rem;
    num=num/10;
    }
    if(sum==mul){
        System.out.println("Number is Spy");
    }else{
        System.out.println("number is not spy");
    }

    }
    
}
