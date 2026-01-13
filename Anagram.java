
public class Anagram {

    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        String c = " ";

        boolean flag = true;

        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            System.out.println("is Not Anagram");
        } else {
            for (int i = 0; i <= a.length() - 1; i++) {
                int count1 = 0;
                int count2 = 0;

                char ch = a.charAt(i);

                for (int j = 0; j <= a.length() - 1; j++) {
                    if (a.charAt(j) == ch) {
                        count1++;
                    }
                }
                for (int k = 0; k <= b.length() - 1; k++) {
                    if (b.charAt(k) == ch) {
                        count2++;
                    }
                }
                if (count1 != count2) {
                    flag = false;
                    System.out.println("is not Anagram");
                    break;
                }

            }

            if (flag == true) {
                System.out.println("is Anagram");
            }
        }
    }
}
