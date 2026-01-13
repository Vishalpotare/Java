public class vish4 {
    public static int factorial(int num){
        int sum=1;
        int i=1;
        while(i<=num){
            sum=sum*num;
            num--;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num=5;
        int facto=factorial(num);
        System.out.println(facto);
    }
    
}
