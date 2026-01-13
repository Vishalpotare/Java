import java.util.Scanner;
public class Arrayarmstrong {
    public static Scanner sc= new Scanner (System.in);
    public static int[] init(){
        int size;
        System.out.println("Enter size of Array");
        size=sc.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter data");
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static boolean armstrong(int num){
        int temp=num;
        int rem;
        int cube;
        int sum=0;
        while(num>0){
            rem=num%10;
            cube=rem*rem*rem;
            sum=sum+cube;
            num=num/10;
        }
        return (temp==sum);
    }
    public static void isarmstrong(int arr[]){
        for(int i=0;i<arr.length;i++){
        if(armstrong(arr[i])){
            System.out.println("armstrong number"+arr[i]);
        }
        }
            
        }
        public static void main(String[] args) {
            int arr[]=init();
            isarmstrong(arr);
        }
    }


