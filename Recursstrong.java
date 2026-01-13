import java.util.Scanner;

public class Recursstrong {
    public static int strong(int num,int sum){
        int fact=1;
        int rem;
        if(num==0){
            return 1;
        }
        return num*fact(num-1);
    }
        public static int stro(int num,int sum){
      
    }
    public static boolean  isfact(int num){
        return num ==strong(num,0);
    }
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        boolean stron=isfact(num);
        System.out.println(stron);
    }
    
}
