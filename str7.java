public class str7 {
    public static void main(String[] args) {
        String b= "Bright Path - @.000";
        int upperCase=0;
        int lowerCase=0;
        int digit=0;
        int space=0;
        int symbols=0;
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)>='A' && b.charAt(i)<='Z'){
                upperCase++;
            }
            else if(b.charAt(i)>='a' && b.charAt(i)<='z'){
                lowerCase++;
            }
            else if(b.charAt(i)>='0' && b.charAt(i)<='9'){
                digit++;
            }
            else if(b.charAt(i)==' '){
                space++;
            }
            else{
                symbols++;
            }
        }
        System.out.println(" upperCase:" +upperCase);
          System.out.println("    lowerCase:"+lowerCase);
            System.out.println(" digit:"+digit);
              System.out.println(" space+:"+space);
                System.out.println(" symbols:"+symbols);
                    
    
}
}
