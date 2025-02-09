
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 4, 5 };
        Arrays.sort(arr);
        int target = 0;
        int left = 0;
        int right = arr.length - 1;
        int result = binarySearch(arr, target, left, right);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found ");
        }
    }

    public static int binarySearch(int arr[], int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (target == arr[mid]) {
            return mid;
        } else if (target < arr[mid]) {
            return binarySearch(arr, target, left, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, right);
        }
    }
}
