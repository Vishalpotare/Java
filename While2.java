import java.util.Scanner;
public class While2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,start,end;
        System.out.println("Enter first number");
        start = sc.nextInt();
        System.out.println("Enter Secound number");
        end = sc.nextInt();
        i=end;
        while(i>=start){
            System.out.println(i);
            i--;
        }

    }
    
}
