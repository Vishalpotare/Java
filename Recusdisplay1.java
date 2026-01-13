import java.util.Scanner;
public class Recusdisplay1 {
    public static void display(int num) {
            if(num==10){
            return;
        }
        System.out.println(num);
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
