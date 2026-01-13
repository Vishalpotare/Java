import java.util.Scanner;
public class Arraypositive {
    public static Scanner sc= new Scanner(System.in);
    public static int[] vish(){
    System.out.println("Enter size");
    int size=sc.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<arr.length;i++){
        System.out.println("Enter data");
        arr[i]=sc.nextInt();
    } 
    return arr;
}
public static void positive(int arr[]){
    int s=0;
    int e=arr.length-1;
    int temp;
    while (s<e) {
        if(arr[s]==1&&arr[e]==0){
        temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;
    }
    else if(arr[s]==0&&arr[e]==0) {
        s++;
        
    }
     else if(arr[s]==1&&arr[e]==1) {
        e--;
        
    }
     else {
        s++;
        e--;
        
    }
}
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int arr[]=vish();
        positive(arr);
        display(arr);
    }
    }

