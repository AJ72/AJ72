class ValidAnagram {

    static boolean validAna(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(validAna(s, t));
    }
}