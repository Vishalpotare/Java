 import java.util.Scanner;
public class strrrep {

    public static String repString(char Old,char New,String a){
        String b="";
        for(int i=0;i<=a.length()-1;i++){
            if(a.charAt(i)==Old){
                b=b+New;
            }
            else{
                b=b+a.charAt(i);
        }}
        return b;


    }
    public static void main(String[]args){
        String a="Bright Path";
        char Old;
        char New;
        String b="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Old char");
        Old=sc.next().charAt(0);
        System.out.println("New char");
        New=sc.next().charAt(0);
        String str=repString(Old,New,a);
        System.out.println(str);



    }
}



