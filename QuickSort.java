public class QuickSort {
    static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
        }

        swap(nums, i + 1, high);
        return i + 1;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void quickSort(int[] nums, int low, int high) {
        if (low < high) {

            int pi = partition(nums, low, high);

            quickSort(nums, low, pi - 1);
            quickSort(nums, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 10, 12, 3, 8, 4 };
        int n = nums.length;
        quickSort(nums, 0, n - 1);
        for (int val : nums) {
            System.out.print(val + " ");
        }
    }
}
