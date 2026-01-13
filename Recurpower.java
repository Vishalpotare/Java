import java.util.Scanner;

public class Recurpower {
    public static int power(int base,int exponent,int sum){
        if(exponent==0){
            return sum;
        }
        sum=sum*base;
        return power(base,exponent-1,sum);
           
        }
        public static void main(String[]args){
            int base;
            int exponent;
            int sum;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter base");
            base=sc.nextInt();
            System.out.println("Enter exponent");
            exponent=sc.nextInt();
            int pow=power(base,exponent,1);
            System.out.println(pow);
        }
    }
    

