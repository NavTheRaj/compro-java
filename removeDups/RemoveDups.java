
import java.util.Arrays;

class RemoveDuplicates {

    static int[] swapFirstAndLast(int[] arr, int len) {

        int temp = arr[0];

        arr[0] = arr[len - 1];

        arr[len - 1] = temp;

        return arr;
    }

    static int[] removeDuplicates(int[] arr, int len) {

        if (len == 1 || len == 0) {
            return arr;
        }

        int j = 0;

        Arrays.sort(arr);

        int[] distictArr = new int[len];

        for (int i = 0; i < len - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                distictArr[j++] = arr[i];
            }
        }

        distictArr[j++] = arr[len - 1];

        return Arrays.copyOfRange(distictArr, 0, j);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int len = arr.length;

        // System.out.println(Arrays.toString(removeDuplicates(arr, len)));

        System.out.println(Arrays.toString(swapFirstAndLast(arr, len)));

    }

}