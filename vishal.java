class vishal1{
    public  void add(){
        System.out.println("AB");
    }
}
class vishal2 extends vishal1{
    
}
class vishal3 extends vishal2{                  //multilevel inheritance
   
}
public class vishal {
    public static void main(String[] args) {
        vishal3 v=new vishal3();
        v.add();
        
    }
    
}
