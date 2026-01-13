import java.util.Scanner;
public class Recursevencount {
    public static void display(int start,int end,int count){
        if(start==end){
            return;
        }
        if(start%2==0){
          System.out.println(count);
        }
        display(start+1,end,count+1);
    }
 public static void main(String[] args) {
     int start;
     System.out.println("Enter Start Number");
     Scanner sc=new Scanner(System.in);
     start=sc.nextInt();
     int end;
     System.out.println("Enter end number");
     end=sc.nextInt();
     display(start, end, 0);
    
 }
    
}
