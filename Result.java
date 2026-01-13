import java.util.Scanner;
public class Result {
    public static void main(String[] args) {
    
    Scanner sc =new Scanner(System.in);
    System.out.print("Marathi=");
    int Marathi=sc.nextInt();
    System.out.print("English=");
    int English=sc.nextInt();
    System.out.print("Math=");
    int Math=sc.nextInt();
    System.out.print("Ds=");
    int Ds=sc.nextInt();
     System.out.print("Algo=");
     int Algo=sc.nextInt();
     System.out.println("_______________________________");
    int Totalmarks;
    Totalmarks= Marathi+English+Math+Ds+Algo;
    System.out.println("Totalmarks="+Totalmarks);
    double average=Totalmarks/5;
    System.out.println("average="+average);
    
    if(average==100 && average>=90){
        System.out.println("Grade A+");
 }else if( average>=80){
System.out.println("Grade A");
}else if(average>=70){
System.out.println("Grade B+");
}else if(average>=60){
System.out.println("Grade B");
}else if(average>=50){
System.out.println("Grade C+");
}else if(average>=40){  
System.out.println("Grade C"); 
}else{
System.out.println("Fail");
}
}
}

