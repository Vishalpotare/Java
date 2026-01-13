
import java.util.Scanner;

public class Array3 {

    public static Scanner sc = new Scanner(System.in);

    public static int[] vishal() {

        System.out.println("enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("ENTER THE DATA");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void iseven(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("print even number" + arr[i]);
            }
        }
    }

    public static void isodd(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("print odd number" + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = vishal(); 
        iseven(arr);           
        isodd(arr);  

    }
}
