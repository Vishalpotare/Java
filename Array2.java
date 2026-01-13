import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
       int size=sc.nextInt();
       int arr[]=new int[size];

       for(int i=0;i<arr.length;i++){
        System.out.println("enter the data");
        arr[i]=sc.nextInt();
       }
       for (int i=0;i<arr.length;i++) {
            System.out.println("data:"+arr[i]);
       }
     
    }
    
}
