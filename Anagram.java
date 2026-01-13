
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm= new HashMap<>();
        String str1="silent";
        String str2="listen";
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                Character key=str1.charAt(i);
                if(!hm.containsKey(key)){
                    hm.put(key, 1);
                }
                else{
                    hm.get(hm.get(key)+1);
                }
            }
            for(int i=0;i<str2.length();i++){
                Character key=str2.charAt(i){
                    if(!hm.containsKey(key)){    
                    }
                    else{
                        hm.get(key,hm.get)
                    }
                }
            }
        }

    }
    
}
