import java.util.Scanner;
public class Recursperfet {
    public static int perfect(int num,int i,int sum){
        if(num==i){
            return sum;
        }
        if(num%i==0){
            sum=sum+i;
        }
        return perfect(num, i+1, sum);

    }
    public static boolean fact(int num,int i){
        return num==perfect(num,i,0);
    }
    public static void main(String[] args) {
        int num;
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        num=sc.nextInt();
        boolean perf=fact(num,i);
        System.out.println(perf);
    }
    
}
