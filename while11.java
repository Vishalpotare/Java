import java.util.Scanner;
public class while11 {
    public static void main(String[] args) {
        int start,end,i;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        start=sc.nextInt();
        System.out.println("enter secound number");
        end=sc.nextInt();
        i=start;
        while(i<=end){
       sum=sum+i;
       i++;

        }
        
        System.out.println(sum);
    }
    
}
