public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        // int target = 11;
        int target = 10;
        int result = linerSearch(arr, target);
        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index: " + result);
        }
    }

    public static int linerSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}