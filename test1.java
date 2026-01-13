public class test1 {
    private int age;
    private int id;
    

public void setAge(int a){
    this.age=a;
}
public int getAge(){
    return this.age;
}

}

class test{
public static void main(String[] args) {
    test1 ft=new test1();
    ft.setAge(58);
    
    System.out.println(ft.getAge()); 
}

}
