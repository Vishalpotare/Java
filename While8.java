import java.util.Scanner;
public class While8 {
    public static void main(String[] args) {
       int i,start,end;
       int count=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("num1");
        start=sc.nextInt();
        System.out.println("num2");
        end=sc.nextInt();
        i=start;
        while(i<=end){
            if(i%5==0){
            System.out.println(i);
            count=count+i;
           
           
        }
        i++;
        
    }
    System.out.println("count="+count);
}

}
