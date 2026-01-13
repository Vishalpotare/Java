import java.util.Scanner;

public class Loopsbreak {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
    int i,start,end;
    System.out.println("Enter first value");
    start=sc.nextInt();
    System.out.println("Enter end value");
    end=sc.nextInt();
    for( i=start;i<=end; i++){
        if(i==5){
            break;
         
    }
    System.out.println(i);
    }
    
}
}
