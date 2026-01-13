public class strrev7 {
    public static void main(String args[]){
        String s= "Vishal";
        String s2= "Potare";
        String s3= " ";
        String s4= " ";
        for(int i=s.length()-1;i>=0;i--){
            s3=s3+s.charAt(i);
        }
        for(int i=s2.length()-1;i>=0;i--){
            s4=s4+s2.charAt(i);
        }
        System.out.println(s3);
        System.out.println(s4);
    }
    
}
