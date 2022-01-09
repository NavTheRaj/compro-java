
import java.util.*;

public class Test3 {
    // Method to return index of element search in collection with binary search
    public static int binarySearch(Collection<Integer> collection, int search) {
        int low = 0;
        int high = collection.size() - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (collection.getElementAt(mid) == search) {
                return mid;
            } else if (collection.get(mid) < search) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };
        System.out.println(addSubtract(arr));

    }

}