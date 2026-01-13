class Student{
    private int id;
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
    
public int calculateTotal(){
    return(math+hindi+science+geography+history);       
}
public double Percentage(){
    return(calculateTotal()/5);
}
public void calGrade(){
    if(Percentage()==90 && Percentage()<=100){
        System.out.println("O++");
    }
    else if(Percentage()==80 && Percentage()<90){
        System.out.println("A");
    }
     else if(Percentage()==70 && Percentage()<80){
        System.out.println("B");
    }
     else if(Percentage()==60 && Percentage()<70){
        System.out.println("C");
    }
     else if(Percentage()==50 && Percentage()<60){
        System.out.println("D");
    }
     else if(Percentage()==40 && Percentage()<50){
        System.out.println("E");
    }

    
}
}
public class Student1{
    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student();
        s.setid(1);
        s.setName("Vishal");
        s.setMath(80);
        s.setHindi(70);
        s.setScience(65);
        s.setGeograpgy(60);
        s.setHistory(50);
        s.getId();
        s.getName();
        s.getMath();
        s.getHindi();
        s.getScience();
        s.getGeograpgy();
        s.getHistory();
        System.out.println(s.getName());
        System.out.println(s.getId());
        int cal=s.calculateTotal();
        System.out.println(cal);
        double per=s.Percentage();
        System.out.println(per);
        s.calGrade();
        System.out.println(calcu)


        s1.setMath(60);
        s1.setHindi(90);
        s1.setScience(70);
        s1.setGeograpgy(70);
        s1.setHistory(90);
        s1.getId();
        s1.getName();
        s1.getMath();
        s1.getHindi();
        s1.getScience(); 
        s1.getGeograpgy();
        s1.getHistory();
        int cal2=s1.calculateTotal();
        System.out.println(cal2);
        double per2=s1.Percentage();
        System.out.println(per2);
        s1.getGrade();
    
    }
}
