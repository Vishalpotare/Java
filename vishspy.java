import java.util.Scanner;
public class vishspy {
    public static boolean spy(int num){
        int mult=1;
        int sum=0;
        int rem;
        while(num>0){
            rem=num%10;
            sum=sum+rem;
            mult=mult*rem;
            num=num/10;
        }
       if(sum==mult){
            return true;
        }else{
            return false;
        }
    }
        public static void main(String[] args) {
            int num;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Number");
            num=sc.nextInt();
            boolean spyno=spy(num);
            System.out.println(spyno);
        }
    }
    

