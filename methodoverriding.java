
class shubham1{
public static void dis(){
 System.out.println("parent");
}
}
class shubham extends shubham1{
    public static void dis(){
        System.out.println("Child");
    }
}
class shubham2{
    public static void display(){
        System.out.println("Child 2");  //mehod overriding
    }
}
public class methodoverriding{
    public static void main(String[] args) {
        shubham1 s1=new shubham1();
        s1.dis();
        shubham s=new shubham();
        s.dis();
        shubham1 s3=new shubham();
        s3.dis();
        s1.display();            //only those methods override that pressent in parent and child class
      
    }
}
