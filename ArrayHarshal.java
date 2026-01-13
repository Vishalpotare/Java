
import java.util.Scanner;

public class ArrayHarshal {

    public static Scanner sc = new Scanner(System.in);

    public static int[] init() {
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the data");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static boolean isharshal(int num) {
        int temp = num;
        int sum = 0;
        int rem;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return (temp%sum==0);
    }

    public static void isharshalchecked(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (isharshal(arr[i])) {
                System.out.println("Harshal number" +arr[i]);
            }
        }
    }

    public static void display(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        
        }
    }
    public static void main(String[] args) {
        int arr[]=init();
        display(arr);
        isharshalchecked(arr);
       
    }
}
