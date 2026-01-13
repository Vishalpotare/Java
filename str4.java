public class str4{
    public static void main(String[] args) {
        String s="Vishal potare 000@-";
        int Alphabets=0;
        int digits =0;
        int space=0;
        int symbols=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=96 && s.charAt(i)<=122){
                Alphabets++;
            }
            else if(s.charAt(i)>=48 && s.charAt(i)<=57){
                digits++;
            }
            else if(s.charAt(i)==' '){
                space++;
            }
            else{
                symbols++;
            }
        }
        System.out.println("Alphabets"+Alphabets);
        System.out.println("digits" +digits); 
        System.err.println("space"+space );
        System.out.println("symbols"+symbols);



    }
}