
import java.util.Scanner;

public class ArrayNeon4 {

    public static Scanner sc = new Scanner(System.in);

    public static int[] vish() {
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the data");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static boolean isneon(int num) {

        int sum = 0;
        int rem;
        int square;
        square = num * num;
        while (square != 0) {
            rem = square % 10;
            sum = sum + rem;
            square = square / 10;
        }

        return sum == num;

    }

    public static void isneon1(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isneon(arr[i])){
 System.out.println(arr[i]);
            sum = sum + arr[i];
            }
           
        }
        System.out.println("enter sum of all : ="+sum);
        
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }

    }

    public static void main(String[] args) {
        int arr[] = vish();
       
        display(arr);
         isneon1(arr);
       
    }
}
