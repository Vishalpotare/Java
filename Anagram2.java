
import java.util.*;

public class Anagram2 {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        String s3 = "";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        boolean flag = true;
        int arr1[] = new int[26];

        if (s1.length() != s2.length()) {
            System.out.println("is not anagram");
        } else {
            for (int i = 0; i < s1.length(); i++) {
                int ch = (int) s1.charAt(i);
                arr1[ch-97] = arr1[ch-97] + 1;
            }
            for (int j = 0; j < s2.length(); j++) {
                int ch = (int) s2.charAt(j);
                arr1[ch-97] = arr1[ch-97] - 1;

            }
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != 0) {
                    flag = false;
                    System.out.println("is not anagram");
                    break;
                }
            }
            if (flag = true) {
                System.out.println("is anagram");
            }
        }
    }

}
