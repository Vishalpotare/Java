import java.util.Scanner;
public class ReverseLoop {
    public static void main(String[] args) {
        int i,start,end;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter start no");
        start=sc.nextInt();
        System.out.println("Enter last no");
        end=sc.nextInt();
        for(i=end; i>=start; i--){
            if(i==5){
            break;

            }

            System.out.println(i);
            }
           
        }
    }
  

