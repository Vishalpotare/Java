import java.util.Scanner;
public class Perfect {
    public static void main(String[] args) {
        int i=1,num;
       int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        num=sc.nextInt();
        for(i=1;i<num;i++){
     if(num%i==0){
        
        sum=sum+i;
        }
    }
        if(sum==num){
            System.out.println("Number is perfect");
        }else{
            System.out.println("number is not perfect");
        }

    }
    }

    

