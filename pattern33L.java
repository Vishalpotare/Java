import java.util.Scanner;
public class pattern33L {
    public static void main(String[]args){
        int i,j;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int mid=num/2+1;
        for(i=1;i<=num;i++){
            for(j=1;j<=num;j++){
                if(j==1 || i==num){
                    System.out.print("*");
                }else{
                System.out.print(" ");
            }
        }
        System.out.println( );
    }
    
}
}

    


    

