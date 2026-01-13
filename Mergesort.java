import java.util.Scanner;
public class Mergesort {
    public static Scanner sc=new Scanner(System.in);
    public static int[]init(){
        System.out.println("Enter Size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter Data");
            arr[i]=sc.nextInt();
        }
         return arr;
    }
    public static void display(int arr[]){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.err.println("]");
    }
    public static void devide(int arr[]){
        if(arr.length==1){
            return;
        }
        int mid=arr.length/2;
        int leftarray[]=new int[mid];
        int rightarray[]=new int[arr.length-mid];
        for(int i=0;i<arr.length;i++){
            if(i<mid){
                leftarray[i]=arr[i];
            }
            else{
                rightarray[i-mid]=arr[i];
            }
        }
          display(leftarray);
        display(rightarray);
        devide(leftarray);
        devide(rightarray);
    }
    public static void main(String[] args) {
           int arr[]=init();
           devide(arr);
    }
    
}
