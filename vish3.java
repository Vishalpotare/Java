public class vish3 {
    public static int power(int base,int exponent) {
        int sum=1;
       
       
        while(exponent>0){
        sum=sum*base;
        exponent--;
        }

        return  sum;
        
    }
    public static void main(String[] args) {
        int base=2,exponent=3;
        int pow = power(base, exponent);
        System.out.println(pow);
        
    }
    
}
