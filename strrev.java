public class strrev{
    public static String revString(String s){
        String s1="";
        int i;
        for(i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);

        }
        return s1;

    }
    public static void main(String []args){
        String s="Pratik More";
        String s1="";
        int start=0;
        int end=s.length()-1;
        int space=0;
        for(int i=0;i<=end;i++){
            if(s.charAt(i) ==' '&& s.charAt(i+1) !=' ' || i==end){
                    space=i;
                s1=s1+revString(s.substring(start,space))+" ";
                start=space+1;
            }
        }
        System.out.println(s1);
    }
}