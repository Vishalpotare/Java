import java.util.Scanner;
public class Recursdisplay {
    public static void display(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        display(num-1);

    }
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        num=sc.nextInt();
        display(num);
       
    }
    
}
