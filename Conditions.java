
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 1st Subject");
        int s1=sc.nextInt();
        System.out.println("Enter the marks of 1st Subject");
        int s2=sc.nextInt();
        System.out.println("Enter the marks of 1st Subject");
        int s3=sc.nextInt();
        System.out.println("Enter the marks of 1st Subject");
        int s4=sc.nextInt();
         System.out.println("Enter the marks of 1st Subject");
         int s5=sc.nextInt();

         double average = (s1+s2+s3+s4+s5)/5.0;
         System.out.println("Total Average" +average);

         if(average==100 && average>=90){
            System.out.println("Grade A+");
     }else if( average>=80){
    System.out.println("Grade A");
    }else if(average>=70){
    System.out.println("Grade B+");
    }else if(average>=60){
    System.out.println("Grade B");
   }else if(average>=50){
    System.out.println("Grade C+");
   }else if(average>=40){  
    System.out.println("Grade C"); 
   }else if(average<40){
    System.out.println("Fail");
}
    }
    
}
