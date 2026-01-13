class test{
    private int id;
    private String name;

public void setId(int id){
    this.id=123;
}
public void setNmame(String name){
    this.name="";
}
public int getId(){
    return this.id;
}
public String getName(){
    return this.name;
}}
public class test1{
    public static void main(String[] args) {
        test t=new test();

        int id=t.getId();
        String name=t.getName();
        

    }
} 
// public class test1{
//     public static void main(String[] args) {
//         test t=new test();
//         t.id=10;
//         t.name="ABC";
//     }
//}