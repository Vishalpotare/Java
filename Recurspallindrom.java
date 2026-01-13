import java.util.Scanner;

public class Recurspallindrom {
    public static int palindrom(int num ,int rev) {
        int rem;
        if(num==0){
        return rev;
        }
           rem=num%10;
           rev=rev*10+rem;

        return palindrom(num/10, rev);
        
    }
    public static int sum(int num) {
        return num==palindrom(num, 1);
    }
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int pallin=sum(num);
        System.out.println(pallin);
    }
    
}
