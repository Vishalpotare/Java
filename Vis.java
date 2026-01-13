interface Vis1{
    int a=10;
    public void display();
    
}
interface Vis2{
    public void display();
}
class Vis3 implements Vis1,Vis2{               //abstraction 
    public void display(){                     // using interface we can achieve 100% abstraction
        System.out.println("ABC");
    }
}                                                //In interface we cannot initiallize variable
public class Vis{                                //we can initiallize + Assign variable
    public static void main(String[] args) {     //we cannot change variable value
        Vis3 v=new Vis3();
        v.display();
        v.a=76;
    }
    
}
