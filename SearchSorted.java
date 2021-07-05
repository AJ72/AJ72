public class SearchSorted {

    static int searchSorted(int[] nums, int target) {

        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {

        int[] nums = { 1, 2, 3, 5, 8 };
        int target = 3;

        System.out.println(searchSorted(nums, target));
    }

}
