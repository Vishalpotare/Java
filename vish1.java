import java.util.Scanner;
public class vish1 {
    public static void add(int a,int b) {
        System.out.println(a+b);


        }

        public static int area(int l, int h) {
            return(l*h);
            
        }
        public static void main(String[]args){
            add(10, 20);
            int l=8,h=4;
            double areaoftringle=0.5*area(l,h);
            System.out.println(areaoftringle);

            int areaofrectrangle=area(l, h);
            System.out.println(areaofrectrangle);

        }
    }
    
    
    