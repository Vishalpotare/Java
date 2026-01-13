import java.util.Scanner;
public class Selectionsort {
    public static Scanner sc= new Scanner(System.in);
    public static int[] init(){
        int size;
        System.out.println("Enter size of array");
        size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Data");
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void selection(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
               
            }
             int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;

        }
    }
       public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=init();
        selection(arr);
        display(arr);
        // display(arr);
    }
    
}
