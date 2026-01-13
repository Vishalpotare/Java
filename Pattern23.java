import java.util.Scanner;
public class Pattern23 {
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int mid=num/2+1;
        for(i=1;i<=num;i++){
            for(j=1;j<=num;j++){
                if((i==mid || j==mid) || (j==1 && i<=mid) || (i==1 && j>=mid) || (j==num && i>=mid) || (i==num && j<=mid)){
                System.out.print("*");
            }
            else{
            System.out.print(" ");
        }
    }
    System.out.println( );
    
}
    }
}
