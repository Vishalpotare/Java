import java.util.Scanner;
public class while6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i,start,end;
        int count=0;
        System.out.println("Enter the first number");
        start=sc.nextInt();
        System.out.println("Enter the secound number ");
        end=sc.nextInt();
        i=start;
        while(i<=end){
            System.out.println(i);
            i++;
            count++;
    

    }
    System.out.println(count);
}
    
}
