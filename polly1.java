public class polly1 {
    public static void add(int a, int b){
        System.out.println(a);
    }
    public static void add(double a, double b){    
      System.out.println(a);
    }
 class polly{
        public static void main(String[] args) {
            polly1 p=new polly1();
            p.add(10, 20);
            p.add(10, 20);
        }
    }
    
}
