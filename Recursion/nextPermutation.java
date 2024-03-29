import java.util.Arrays;

/**
 * nextPermutation
 */
public class nextPermutation {


    public static void swap(int array[], int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void reverseOfArray(int arr[], int s, int e) {
        for (int i = s; i < (s + e) / 2; i++) {
            swap(arr, i, s + e - i - 1);
        }
    }

    public static void nextPermutationOfArray(int arr[]) {
        int n = arr.length;
        int idx = -1;
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            reverseOfArray(arr, 0, n);
        } else {
            int prev = idx;
            for (int i = idx + 1; i < n; i++) {
                if (arr[i] > arr[idx - 1] && arr[i] <= arr[prev]) {
                    prev = i;
                }
            }
            swap(arr, idx - 1, prev);
            reverseOfArray(arr, idx, n);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 6, 4, 5};
        nextPermutationOfArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
