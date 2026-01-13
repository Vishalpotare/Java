import java.util.Scanner;
public class pattern36M {
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int mid=num/2+1;
        for(i=1;i<=num;i++){
            for(j=1;j<=num;j++){
                if(j==1 || j==num || j==i && j<=mid || i+j==num+1 && j>=mid){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }
    }
    
}
