class Inertial {

    static int isIntertial(int[] arr) {

        int len = arr.length;
        int hasOdd = 0;
        int hasEven = 0;
        int oddMaxSum = 0;
        int maxValue = arr[0];

        for (int i = 0; i < len; i++) {

            // Getting the count of odd value
            if (arr[i] % 2 != 0) {
                hasOdd++;
            } else {
                hasEven++;
            }
            // Max Value
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }

        }

        // Return 0 if there are no odd value or the max value is not even before
        // calculating further
        if (hasOdd == 0 || maxValue % 2 != 0) {
            return 0;
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[i] % 2 != 0 && arr[i] > arr[j] && arr[j] % 2 == 0 && arr[i] < maxValue) {
                    oddMaxSum++;
                }
            }
        }

        System.out.println(hasOdd + "\t" + maxValue + "\t" + oddMaxSum);

        if (hasEven == 1) {
            return 1;
        }

        return (hasEven - hasOdd == oddMaxSum) ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 12, 12, 4, 6, 8, 11 };
        System.out.println(isIntertial(arr));
    }
}