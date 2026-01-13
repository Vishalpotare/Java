public class study {
    public void add(){
        System.out.println("ABC");
    }
}
class study1 extends study{              //multilevel inheritance

}
class study2 extends study1{

}
class study3{
    public static void main(String[] args) {
        study2 s= new study2();
        s.add();
    }
}
