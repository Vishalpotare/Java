import java.util.Scanner;
public class while14 {
    public static void main(String[] args) {
     int num;
     int rem;
     int count=0;
     int sum=0;
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the number");
     num=sc.nextInt();
     while(num>0){
        rem=num%10;
        if(rem%2==0){
            sum=sum+rem;
            count++;
      }
           num=num/10;
     }
     System.out.println(count);
     System.out.println(sum);
    }
    
}
