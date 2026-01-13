import java.util.Scanner;
public class while7{
    public static void main(String[] args) {
        int i,start,end;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        start=sc.nextInt();
        System.out.println("Enter the secound number");
        end=sc.nextInt();
        i=start;
        while(i<=end){
            if(i%2!=0){
               System.out.println(i);

            }
            i++;
        }
        

}
}
    

