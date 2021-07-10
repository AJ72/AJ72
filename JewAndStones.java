import java.util.HashMap;

public class JewAndStones {

    static int findJewNSton(String jewels, String stones) {

        // HashMap<Character, Integer> map = new HashMap<>();

        // for (char c : stones.toCharArray()) {
        // map.put(c, map.getOrDefault(c, 0) + 1);
        // }

        int count = 0;
        // for (char c : jewels.toCharArray()) {
        // if (map.containsKey(c)) {
        // count += map.get(c);
        // }
        // }
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String args[]) {

        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(findJewNSton(jewels, stones));
    }
}