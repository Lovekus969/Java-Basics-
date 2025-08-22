public class LastOccurrence {
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;       // possible answer
                low = mid + 1;      // keep searching right
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 4, 5, 7, 9};
        int target = 4;
        System.out.println("Last occurrence index: " + lastOccurrence(nums, target));
    }
}
