import java.util.Scanner;
public class Recursprime {
    public static boolean  prime(int num,int i){
       
        if(num == i){
            return true;
        }

        if(num %i==0){
            return false;
        }
    
       return prime(num,i+1);
}
    public static void main(String[]args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        num=sc.nextInt();
        boolean prim=prime(num,2);

        System.out.println(prim);
    }
     

}
