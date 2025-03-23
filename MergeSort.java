
public class MergeSort {

    public static void Merge(int[] arr, int l, int m, int r) {
        int arr1Length = m - l + 1;
        int arr2Length = r - m;
        int[] arr1 = new int[arr1Length];
        int[] arr2 = new int[arr2Length];
        for (int i = 0; i < arr1Length; i++) {
            arr1[i] = arr[l + i];
        }
        for (int j = 0; j < arr2Length; j++) {
            arr2[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0, k = l;

        while (i < arr1Length && j < arr2Length) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<arr1Length){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2Length){
            arr[k]=arr2[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int median = (l + r) / 2;
            mergeSort(arr, 0, median);
            mergeSort(arr, median + 1, r);
            Merge(arr, l, median, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 7 };
        for (int n : arr) {
            System.out.print(n + " ");
        }
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array ---->");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
