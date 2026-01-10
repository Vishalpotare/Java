import java.util.Scanner;
public class Twosum{
    public static Scanner sc=new Scanner(System.in);
    public static int[]init(){
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
                System.err.println("Enter Data");
                arr[i]=sc.nextInt();
            }
            return arr;
        }
        public static void display(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);                                 //to sum question for sorted array
            }
            System.out.print("");
        }
        public  static int  isTwosum(int arr[],int target){
            int start=0;
            int end=arr.length-1;
            int sum=0;
            int count=0;
            while(start<end){
                  sum=arr[start]+arr[end];
            if(sum==target){
                 System.out.println("["+arr[start]+" ," +arr[end]+"]");
               count++;
               start++;
               end--;

            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        System.out.println("Total no of pairs with 7 target:");
         return count;
    }
        public static void main(String[] args) {
            int arr[]=init();
            display(arr);
            int TW=isTwosum(arr, 7);
            System.out.println(TW);
        }
        
    }

