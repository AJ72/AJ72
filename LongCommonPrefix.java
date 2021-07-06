public class LongCommonPrefix {

    static String findPrefix(String[] arr) {

        String str = arr[0];
        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(str) != 0) {
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }

    public static void main(String args[]) {
        String[] arr = { "colorado", "color", "cold" }; // col
        String[] arr1 = { "c", "o", "d" }; // ""

        System.out.println(findPrefix(arr1));
    }
}
