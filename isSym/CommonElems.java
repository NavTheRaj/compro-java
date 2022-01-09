import java.util.Arrays;
import java.util.HashSet;

public class CommonElems {

    static int[] getCommonElements(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    set.add(arr1[i]);
                }
            }
        }

        int[] commonArr = new int[set.size()];

        int k = 0;
        for (int num : set) {
            commonArr[k++] = num;
        }

        return commonArr;

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 8, 3, 2 };
        int[] arr2 = { 4, 2, 6, 1 };

        System.out.println(Arrays.toString(getCommonElements(arr1, arr2)));
    }
}
