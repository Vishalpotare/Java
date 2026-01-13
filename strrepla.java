import java.util.Scanner;
public class strrepla {
    public static String repString(char Old,char New,String a){
        String b="";
        for(int i=0;i<=a.length()-1;i++){
            if(a.charAt(i)=='B'){
                b=b+'W';
            }
            else{
                b=b+a.charAt(i);
        }}
        return b;


    }
    public static void main(String[]args){
        String a="Bright Path";
        char Old='B';
        char New='W';
        String b="";
        Scanner sc=new Scanner(System.in);
        String str=repString(Old,New,a);
        System.out.println(str);



    }
}
