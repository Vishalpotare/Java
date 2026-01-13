import java.util.Scanner;
public class Insersionsort {
    public static Scanner sc= new Scanner(System.in);
    public static int [] init (){
        System.out.println("Enter size");
        int Size=sc.nextInt();
        int arr[]= new int[Size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Data");
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;

        }
    
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=init();
        display(arr);
        sort(arr);
        display(arr);

    }
    
}
