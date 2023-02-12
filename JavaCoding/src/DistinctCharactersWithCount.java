import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DistinctCharactersWithCount {

    public static void main(String[] args) {
        String s = "sanketsanketsanketsanket";

        // Get distinct characters with their count
        Map<Character, Integer> hashMap = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            } else {
                hashMap.put(s.charAt(i), 1);
            }
        }

        // Print the key with their values
        Iterator<Map.Entry<Character, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> currentEntry = iterator.next();
            System.out.println("Key = " + currentEntry.getKey() + " & value = " + currentEntry.getValue());
        }
    }
}
