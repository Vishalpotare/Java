
import java.util.Scanner;

public class Arrayreverse{
    public static Scanner sc= new Scanner(System.in);
     public static int [] init(){
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter data");
            arr[i]=sc.nextInt();
        }
   return arr;
    }
    public static void reverse(int arr[]){
        int s=0;
        int e=arr.length-1;
        int temp;
        while(s<e){
            temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
    }
}
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]=init();
        display(arr);
        reverse(arr);
        display(arr);
    }
   

}
