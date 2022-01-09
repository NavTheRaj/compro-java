class IsMadhavArray {

    static int isMadhavArray(int[] arr) {

        int isMadhavArray = 0;
        int startIdx = 0;
        int endIdx = 0;
        int round = 1;
        int arrayLen = arr.length;
        int currentArrayLength = 1;
        int calcArrayLength = 1;
        int roundSum = 0;
        int accumulativeSum = 0;

        while (currentArrayLength <= arrayLen) {
            // First if else to check the arraylength with calculated array and accumulate
            // the sum
            if (calcArrayLength == currentArrayLength) {
                for (int i = startIdx; i <= endIdx; i++) {
                    roundSum += arr[i];
                }
            } else {
                isMadhavArray = 0;
                break;
            }

            // Second if else for checking the sum
            if (accumulativeSum == roundSum || startIdx == endIdx) {
                accumulativeSum = roundSum;
                roundSum = 0;
                isMadhavArray = 1;
            } else {
                isMadhavArray = 0;
                break;
            }

            // Third if else to check the arraylength and currentArraylength boundaries

            if (currentArrayLength == arrayLen) {
                break;
            } else {
                startIdx = endIdx + 1;
                endIdx = startIdx + round;

                if (startIdx < arrayLen && endIdx < arrayLen) {
                    round++;
                } else {
                    endIdx = arrayLen - 1;
                    round = endIdx - startIdx;
                }

                calcArrayLength = round * (round + 1) / 2;
                currentArrayLength = endIdx + 1;
            }
        }

        return isMadhavArray;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 1 };
        System.out.println(isMadhavArray(arr));
    }
}