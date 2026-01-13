import  java.util.Scanner;
public class Comparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("Enter the character");
        ch=sc.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("Character is alphabet");
           
          }  else if(ch>='0' && ch<='9'){
                System.out.println("Character is Digit");
        
                }
        
     
    }

    
}
