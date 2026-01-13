public class strdoublechar {
    public static String strchar(String a) {
       String a2 =" ";
        for (int i=0; i<a.length()-1; i++) {
           char ch=a.charAt(i);
        if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
            int count = 0;
         
        for(int j = 0; j < a.length()-1; j++) {
           if (a.charAt(j) == ch) {
            count++;
        }
         }if (count > 1) {
                    a2=a2+ch+"="+count+ "  ";
                  
                }
            }
        }
        return a2;
    }
    public static void main(String[] args) {
          String a= "Pratik Madhukar More04@--AAm";
          String a2=" ";
          String str=strchar(a);
          System.out.println(str);

    }
}
