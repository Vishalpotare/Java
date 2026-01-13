import java.util.Scanner;
public class Recurscount {
    public static void display(int s,int e,int cnt) {
          if(s==e){
            System.out.println(cnt);
            return;
          }
        
    display(s+1,e,cnt+1);
    

    
}
public static void main(String[] args) {
    int s;
    int e;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    s=sc.nextInt();
    System.out.println("Enter the Number");
    e=sc.nextInt();
    display(s, e,0);
}
}
