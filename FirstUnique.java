//import java.util.HashMap;
//import java.util.Map;

public class FirstUnique {

    static int getUnique(String str) {

        // Map<Character, Integer> map = new HashMap<>();

        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a'] = count[str.charAt(i) - 'a'] + 1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // for (char c : str.toCharArray()) {
        // map.put(c, map.getOrDefault(c, 0) + 1);
        // }

        // for (int i = 0; i < str.length(); i++) {
        // if (map.get(str.charAt(i)) == 1) {
        // return i;
        // }
        // }

        return -1;
    }

    public static void main(String args[]) {

        String str = "abcabd";

        System.out.println(getUnique(str));

    }
}