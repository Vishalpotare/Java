abstract class bank{
    abstract void display();

}
abstract class bank1{
    abstract void display();
}
class bank2 extends  bank, bank1{
    public void display(){
    System.out.println("Widrawal");       // Multiple inheritance cannot achieved using abstract class beacause,
                                            // it has also non abstract methods
    }
}

public class Abstraction {
    public static void main(String[] args) {
        bank2 b=new bank2();
        b.display();
    }
    
}
