import java.util.Scanner;
public class bubblesortbest {
    public static Scanner sc=new Scanner(System.in);
    public static int[] init(){
        System.out.println("Enter size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
           System.out.println("Enter data");
           arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int swap=0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                  swap=1;
                }
            
            } 
        
                if(swap==0){
                  break;
            }
            System.out.println("Array sorted");

        }
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args) {
        int arr[]=init();
        sort(arr);
        display(arr);

    }
    }
   
  
