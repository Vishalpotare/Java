import java.util.Scanner;

public class vishautomorphic {

    public static boolean automorphic(int num) {
        int square;
        int temp=num;
        int digits=0;
         square = num * num;
        while (temp>0) {
             digits++;
             temp=temp/10;
        }
        int lastDigits=square% (int)Math.pow(10,digits);
            if(lastDigits==num){
                return true;
            }  

        return false;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        num = sc.nextInt();

        boolean automorp = automorphic(num);
        System.out.println(automorp);
    }
}
