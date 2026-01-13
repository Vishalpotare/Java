import java.util.Scanner;
public class Pattern22 {
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int mid=num/2+1;
        for(i=1;i<=num;i++){
            for(j=1;j<=num;j++){
                if(i==mid || j==mid){
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
