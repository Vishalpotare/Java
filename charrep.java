public class charrep {
    public static String replword(String a,int end){
        String a1="";
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)==' '){
                a1=a1+(a.substring(i+1,end))+" ";
                end=i;
            }
            else if(i==0){
              a1=a1+(a.substring(0,end));
            }
        }
        return a1;

    }

    
    public static void main(String[] args) {
        String a="Bright Path Institude";
        String a1="";
        int end=a.length();
        String str=replword(a,end);
        System.out.println(str);

        
    }
    
}
