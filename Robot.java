public class Robot {

    static boolean returnRobot(String str) {

        int UD = 0;
        int LR = 0;

        for (char c : str.toCharArray()) {
            if (c == 'U')
                UD++;
            else if (c == 'D')
                UD--;
            else if (c == 'L')
                LR--;
            else {
                LR++;
            }
        }
        return LR == 0 && UD == 0;
    }

    public static void main(String args[]) {

        String str = "URURD"; // false
        String str1 = "RUULLDRD"; // true

        System.out.println(returnRobot(str1));
    }
}
