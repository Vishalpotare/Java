import java.util.Scanner;
public class while4 {
    public static void main(String[] args) {
        int i,start,end;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        start=sc.nextInt();
        System.out.println("enter secound number");
        end=sc.nextInt();
        i=start;
        while(i<=end){
            if(i==5){
            break;
        }
        System.out.println(i);
        i++;

    }
}
    
}
