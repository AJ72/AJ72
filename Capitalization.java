public class Capitalization {

    static boolean findCapital(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        return count == 0 || count == str.length() || count == 1 && Character.isUpperCase(str.charAt(0));
    }

    public static void main(String args[]) {

        String str = "uSa"; // false
        String str1 = "USA"; // true
        String str2 = "Usa"; // true
        String str3 = "usa"; // true

        System.out.println(findCapital(str));

    }
}
