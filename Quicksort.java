
import java.util.Scanner;

public class Quicksort {
    public static Scanner sc= new Scanner(System.in);
    public static int[] init(){
        System.out.println("Enter size");
        int size=sc.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Data");
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int quick(int arr[],int lb, int ub){
        int start=lb;
        int end=ub;
        int pivot=arr[lb];
        while(start<end){
        while(arr[start]<pivot){
            start++;
        }
        while(arr[end]>=pivot){
            end++;
        }
        if(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        return end;
    }
        
        if(lb>ub){
            int temp=arr[pivot];
            arr[pivot]=arr[end];
            arr[end]=temp;  
        }
        quick(arr, lb, ub);
    }

        public static void main(String[] args) {
    
        }
    }

    

    

