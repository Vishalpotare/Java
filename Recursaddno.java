import java.util.Scanner;

public class Recursaddno {
    public static void display(int s,int e) {
        if(s==e){
            return;
        }
        if(s%2!=0){
          System.out.println(s);
        }  
        display(s+1,e);
 
    }
    public static void main(String[] args) {
        int s;
        int e;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Start No");
        s=sc.nextInt();
        System.out.println("Enter End No");
        e=sc.nextInt();
        display(s, e);

    }
    
}
