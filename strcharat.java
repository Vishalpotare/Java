import java.util.Scanner;
public class strcharat {
    public static String changstr(String s,int n){
        String s1="";
        for(int i=0;i<=s.length()-1;i++){
            if(i==n-1){
                s1  = s1 + s.charAt(i) ;
               
               break;
             
        }
        
    }
        return s1;

    }
    public static void main(String[]args){
        String s="Bright Path";
        String s1="";
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Num");
        n=sc.nextInt();
        String str=changstr(s,n);
        System.out.println(str);

    }
    
}
