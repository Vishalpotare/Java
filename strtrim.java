public class strtrim {
    public static String strtrim(String a){
        String a1=" ";
        for(int i=0;i<=a.length()-1;i++){
            if(a.charAt(i)!=' '){
               a1=a1+a.charAt(i);
            }

            }
             return a1;
        }
       

    
    public static void main(String[]args){
        String a=" Bright Path ";
        String a1="";
        String str= strtrim(a);
        System.out.println(str);

    }
    
}
