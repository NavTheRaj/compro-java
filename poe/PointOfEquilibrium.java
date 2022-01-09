class PointOfEquilibrium {
    static int getPOE(int[] arr) {
        int poe = -1;

        int innerSum = 0;
        int outerSum = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            outerSum = outerSum + arr[i];
            innerSum = 0;
            for (int j = i + 2; j < arr.length; j++) {
                innerSum = innerSum + arr[j];
            }

            if (innerSum == outerSum) {
                poe = i + 1;
                break;
            }
        }
        return poe;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 10, 3, 4 };
        // Print the result
        System.out.println("Index:" + getPOE(arr));
        int eqIdx = getPOE(arr);
        // Print the actual number on poe
        System.out.println("Actual POE Number:" + arr[eqIdx]);
    }
}