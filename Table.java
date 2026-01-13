import java.util.Scanner;
public class Table {
    public static void main(String[]args){
        int i=1;
        int start;
        int mul=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        start=sc.nextInt();
        for(i=1;i<=10;i++){
          mul=start*i;
          System.out.println(mul);
        }
        

        }
      }

