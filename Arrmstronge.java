import java.util.Scanner;
public class Arrmstronge {
    public static void main (String[]args){
        int num;
        int rem;
        int sum=0;
        int cube;
        int temp;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(num>0){
        rem=num%10;
        cube=rem*rem*rem;
        sum=cube+sum;
        num=num/10;
       
    }
    System.out.println(num); 
    System.out.println(sum);
    System.out.println(temp);
    if(sum==temp){
            System.out.println("Number is armstrong");
        }else{
            System.out.println("Number is not armstrong");
        }
       
    }
    
}

