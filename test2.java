public class test2{
    private int id;

public void setId(int id){
    this.id=id;
}
public int getId(){
    return this.id;
}
}
class test3{
public static void main(String[] args) {
    test2 t=new test2();
    t.setId(20);
    System.out.println(t.getId());
    
}


}
