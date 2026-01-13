import java.util.Scanner;
public class vishperfect {
    public static boolean perfect(int num){
        int i=1;
        int sum=0;
        for(i=1;i<=num;i++){
            if(num%i==0){
                sum=sum+i;
            }}
                if(sum==num){
                    return true;
                }
                return false;
            }
            public static void main(String[]args){
                int num;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the Number");
                num=sc.nextInt();
                boolean perf=perfect(num);
                System.out.println(perf);

            }
        }
    
    

