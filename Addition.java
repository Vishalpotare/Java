public class Addition{
    public static void add(int a,int b){
        int c;
        c=a+b;
        System.out.println(c);
    }
    public static void add(double a,double b){     //same method diff parameter (Method overloadding)
        double c;
        c=a+b;
        System.out.println(c);
    }
}
     class Addition1{
        public static void main(String[] args) {
            Addition s=new Addition();
            s.add(10, 20);
            s.add(10, 20);
        }
    }
    

