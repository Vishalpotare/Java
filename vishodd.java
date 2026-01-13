import java.util.Scanner;
public class vishodd {
    public static int odd(int num) {
        int i=1;
        while(num>i){
            i++;
        }
        if(num%2!=0){
        System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
        return num;
        
        
    }
    public static void main(String[] args) {
        int num;
        int rem;
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        num=sc.nextInt();
        odd(num);
    }
    
}

