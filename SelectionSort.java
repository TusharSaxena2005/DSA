public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 90, 11 };
        for (int nums : selectionSort(arr)) {
            System.out.print(nums + " ");
        }
    }

    public static int[] selectionSort(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int maxNum = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[maxNum]) {
                    maxNum = j;
                }
            }
            temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[maxNum];
            arr[maxNum] = temp;
        }
        return arr;
    }
}
