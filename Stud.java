import java.util.Scanner;
class Student{  private int id;
    private String name;
    private int math;
    private int hindi;
    private int science;
    private int geography;
    private int history;
    private String grade;
    public void setid(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMath(int math){
        this.math=math;
    }
    public void setHindi(int hindi){
        this.hindi=hindi;
    }
    public void setScience(int science){
        this.science=science;
    }
    public void setGeograpgy(int geography){
        this.geography=geography;
    }
    public void setHistory(int history){
        this.history=history;
    }
    public int getId(){
        return this.id;
    }  
    public String getName(){
        return this.name;
    }  
    public int getMath(){
        return this.math;
    }  
    public int getHindi(){
        return this.hindi;
    }  
    public int getScience(){
        return this.science;
    }  
    public int getGeograpgy(){
        return this.geography;
    }  
    public int getHistory(){
        return this.history;
    }  
    public String getGrade(){
        return this.grade;
    }
 


}
public class Stud {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[] s =new Student[2];

        for (int i=0;i<2;i++) {
          s[i]=new Student();
          System.out.println("Enter id");
          s[i].setid(sc.nextInt());
          s[i].setName(sc.nextLine());
          
         
          
        // s.setid(1);
        // s.setName("Vishal");
        // s.setMath(80);
        // s.setHindi(70);
        // s.setScience(65);
        // s.setGeograpgy(60);
        // s.setHistory(50);
        // s.getId();
        // s.getName();
        // s.getMath();
        // s.getHindi();
        // s.getScience();
        // s.getGeograpgy();
        // s.getHistory();
        }
        
       
        for (int i=0;i<2;i++) {
          
          System.out.println("id"+s[i].getId());       /////we can give aso display method
          

    }
    
    
}}
