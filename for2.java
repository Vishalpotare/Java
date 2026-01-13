import java.util.Scanner;
public class for2 {
    public static void main(String[] args) {
        int i,start,end;
       int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        start=sc.nextInt();
        System.out.println("enter secound number");
        end=sc.nextInt();
        for(i=start;i<=end;i++){
     if(i%2==0){//even
       // if(i%2!=0){ for odd
        System.out.println(i);
        sum=sum+i;
        }
    }
        System.out.println(sum);

    }
    }

    

