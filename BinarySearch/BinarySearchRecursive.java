public class BinarySearchRecursive {
    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high) return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) return binarySearch(arr, mid + 1, high, target);
        else return binarySearch(arr, low, mid - 1, target);
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 12, 16, 23, 38};
        int target = 16;
        int result = binarySearch(nums, 0, nums.length - 1, target);

        if (result != -1)
            System.out.println("Found at index " + result);
        else
            System.out.println("Not Found");
    }
}
