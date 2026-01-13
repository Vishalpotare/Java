import java.util.Scanner;
public class ArraySpy {
    public static Scanner sc=new Scanner(System.in);
    public static int[] vishal(){
          System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter data");
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static boolean spy(int num){
        int sum=0;
        int rem;
        int mul=1;
        while(num>0){
            rem=num%10;
            sum=sum+rem;
            mul=mul*rem;
            num=num/10;
        }
        return (sum==mul);
    }
    public static void isspy(int arr[]){
        for(int i=0;i<arr.length;i++){
        if(spy(arr[i])){
            System.out.println("Spy numbers"+ arr[i]);
        }
    }
    }
    public static void main(String[] args) {
        int arr[]=vishal();
        isspy(arr);
    }
    
}
