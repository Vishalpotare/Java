import java.util.Scanner;
public class strfunc {
    public static String rev(int start,int end,String a){
        String b="";
        for(int i=start;i<end;i++){
            b=b+a.charAt(i);
        }
       
           return b;
    }
    public static void main(String[]args){
        String a=" Bright Path";
        String b=" ";
        int i=0;
        int start;
        int end;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Start");
        start=sc.nextInt();
        System.out.println("Enter End");
        end=sc.nextInt();
        String str=rev(start,end,a);
        System.out.println(str);


    }
    
}
