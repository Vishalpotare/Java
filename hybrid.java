class hybrid1{
    public void display(){
System.out.println("ABC");
    }
    
}
class hybrid2 extends hybrid1{
       
    }
    class hybrid3 extends hybrid1{          //hirachical inheritance

    }

 public class hybrid{
    public static void main(String[] args) {
        hybrid2 h2=new hybrid2();
        h2.display();
        hybrid3 h3=new hybrid3();
        h3.display();
    }
 }
    
