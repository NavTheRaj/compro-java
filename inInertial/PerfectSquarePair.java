public class PerfectSquarePair {

    static int countSquarePairs(int[] arr) {
        int len = arr.length;

        if (len < 2) {
            return 0;
        }
        int squarePair = 0;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[i] > 0 && arr[j] > 0 && arr[i] < arr[j] && Math.sqrt(arr[i] + arr[j]) % 1 == 0) {
                    System.out.println(arr[i] + "," + arr[j]);
                    squarePair++;
                }
            }
        }
        return squarePair;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 9, 10, 20 };

        System.out.println(countSquarePairs(arr));
    }
}
