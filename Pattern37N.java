import java.util.Scanner;
public class Pattern37N {
    public static void main (String[]args){
        int i,j;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int mid=num/2+1;
        for(i=1;i<=num;i++){
            for(j=1;j<=num;j++){
                if(j==1 || j==num || (i==j && j<=num)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }
    }
    
}
