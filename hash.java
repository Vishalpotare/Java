import java.util.HashMap;
public class hash {
    public static void main(String[] args) {
        HashMap <Integer, String> mp = new HashMap<>();
        mp.put(1, "Mango");
        mp.put(2, "Apple");
        mp.put(3,"orange");
        mp.put(1,"Dragon");

        mp.get(1);
        mp.get(2);
    }
    
}
