import java.util.Scanner;
public class vishharshad {
    public static boolean harshad(int num) {
        int temp;
        temp=num;
        int rem;
        int sum=0;
        while(num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
          }

        if(temp%sum==0){
            
            return true;

        }
        return false;
        
    }
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Numbers");
        num=sc.nextInt();
        boolean harsh=harshad(num);
        System.out.println(harsh);
        
    }
    
}
