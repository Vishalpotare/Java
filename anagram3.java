public class anagram3 {
    public static void main(String[] args) {

    String s1="Vishalpotare@1234";
    String s2="Vishalpotare@1234";
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();

    int arr2[]=new int[26];

    boolean flag=true;
    if(s1.length()!=s2.length()){
        System.out.println("is not anagram");
    }
    else{
        for(int i=0;i<s1.length();i++){
            int ch = (int) s1.charAt(i);
            arr2[65535-ch]=arr2[65535-ch]+1;

        }
        for(int j=0;j<s2.length();j++){
            int ch= (int) s2.charAt(j);
            arr2[65535-ch]=arr2[65535-ch]-1;
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2.length!=0){
                flag=false;
                System.out.println("is not anagram");
                break;
            }
        
        }
        if(flag=true){
            System.out.println("is anagram");
        }

    }
    
    }
    
}
