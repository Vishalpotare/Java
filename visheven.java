import java.util.Scanner;
public class visheven {
    public static boolean perfect(int num){
        int i=1;
        int sum=0;
        while(i>=1){
            if(num%i==0){
                sum=sum+i;
            }
            i++;
        }
        
        if(num==sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        num=sc.nextInt();
        boolean perf=perfect(num);
        System.out.println(perf);
    }
    
}
