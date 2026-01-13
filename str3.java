public class str3 {
    public static void main(String[] args) {
        String s="Bright Path@123";
        int lowerCase=0;
        int upperCase=0;
        int degit=0;
        int specialChar=0;
        int space=0;
        
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)>=97 && s.charAt(i)<=122) 
             {
                lowerCase++;
             }
             else if(s.charAt(i)>= 65 && s.charAt(i)<=90){                                                         //a-z=97 to122
                                                                            //A-Z=65 to 90
                     upperCase++;                                                       //0-9 48 -57
             }
             else if(s.charAt(i)>= 48 &&s.charAt(i)<=57){
                degit++;
             }
             else if(s.charAt(i)==' ')
             {
                space++;
             }
             else
             {
                specialChar++;
             }
        
    }
    System.out.println("lowerCase:"+lowerCase+" upperCase:"+upperCase+" degit:"+degit+" specialChar:"+specialChar+" space:"+space);
}
}
    

