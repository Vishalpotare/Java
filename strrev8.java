public class strrev8 {
    public static void main(String[]args){
        String s="Vishal Potare";
        String s1=" ";
        for(int i=s.length()-7;i>=0;i--){
             s1=s1+s.charAt(i);
        }
          for(int i=s.length()-1;i>=7;i--){
         s1=s1+s.charAt(i);
          
    }
     System.out.println(s1);
    
}}
