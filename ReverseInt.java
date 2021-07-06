public class ReverseInt {

    static int reverseInt(int x) {

        boolean neg = false;
        if (x < 0) {
            neg = true;
            x = -1 * x;
        }
        int reversed = 0;
        while (x > 0) {
            reversed = (reversed * 10) + (x % 10);
            x /= 10;
        }

        return neg ? (-1 * reversed) : reversed;

    }

    public static void main(String args[]) {

        int num = 321; // 123
        int num1 = -453; // -354

        System.out.println(reverseInt(num1));
    }

}
