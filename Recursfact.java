import java.util.Scanner;
public class Recursfact {
    public static int fact(int num) {
        if(num==0 || num==1){
            return 1;
        }
       
         return num*fact(num-1);
    }
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        num=sc.nextInt();
        int isfact=fact(num);
        System.out.println(isfact);
        
    }
        
    }
    

