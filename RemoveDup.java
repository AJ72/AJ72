//remove duplicates from sorted array

public class RemoveDup {

    static int removeDup(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[count]) {
                count++;
                arr[count] = arr[i];
            }
        }
        return count + 1;
    }

    public static void main(String args[]) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }; // 5 {unique elements}

        System.out.println(removeDup(arr));
    }
}
