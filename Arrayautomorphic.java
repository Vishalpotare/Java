
import java.util.Scanner;

public class Arrayautomorphic {

    public static Scanner sc = new Scanner(System.in);

    public static int[] init() {
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the data");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static boolean automorphic(int num) {
        int temp = num;
        int square;
        square = num * num;
        int digit = 0;
        while (temp > 0) {
            digit++;
            temp = temp / 10;
        }
        int lastDigit = square % (int) Math.pow(10, digit);
        return (lastDigit == num);
    }

    public static void isautomorphic(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (automorphic(arr[i])) {
                System.out.println("Automorphic number:-" + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = init();
        isautomorphic(arr);
    }
}
