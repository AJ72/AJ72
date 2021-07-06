class TwwoSum {

    static boolean findSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (target - arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {

        int[] arr = { 1, 3, 8, 2 };
        int target = 14;

        System.out.println(findSum(arr, target));
    }
}