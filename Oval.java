import  java.util.Scanner;
public class Oval {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("Enter the character");
        ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'  ){
            System.out.println("Char is oval");
        }
        else if(ch>='a' || ch<='z' || ch>='A' || ch<='Z'){
            System.out.println("Character is alphabet");
        }



        

    }
    
}
