import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int spy=0;
        int i,start,end;
        System.out.println("Enter first value");
        start=sc.nextInt();
        System.out.println("Enter end value");
        end=sc.nextInt();
        for( i=start;i<=end; i++){
System.out.println(i);
spy++;
        }
        System.out.println(spy);

    }
    
}
