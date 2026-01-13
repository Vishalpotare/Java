import java.util.Scanner;
public class Recursodd {
    public static void display(int num) {
        if(num==10){
            return;
        }
        if(num%2!=0){
            System.out.println(num);
        }
        display(num+1);
        
    }
    public static void main(String[] args) {
        int num;
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        display(num);
    }
    
}
