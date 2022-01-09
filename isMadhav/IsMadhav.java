class IsMadhav {

    static int isMadhav(int[] arr) {
        int isMadhav = 1;
        // int isMadhavLength = 0;

        if (arr.length < 3)
            return 0;

        // for (int i = 1; i <= arr.length; i++) {
        // if (i == i * (i + 1) / 2) {
        // isMadhavLength = 1;
        // }
        // }

        // if (isMadhavLength != 1)
        // return 0;

        int startIdx = 1;
        int round = 1;
        int endIdx = startIdx + round;
        int firstNum = arr[0];

        while (isMadhav == 1 && endIdx <= arr.length) {
            int sum = 0;

            for (int i = startIdx; i <= endIdx; i++) {
                sum += arr[i];
            }

            if (sum != firstNum)
                isMadhav = 0;

            round++;
            startIdx = endIdx + 1;
            endIdx = startIdx + round;

        }

        return isMadhav;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 0 };
        System.out.println(isMadhav(arr));
    }
}

// int isMadhavArray = 0;
// int arrayLength = a.length;
// int startIndex = 0; // start index of current array elements under
// consideration
// int endIndex = 0; // end index of current array elements under consideration
// int n = 1; // track current length of array elements between start and end
// index
// int currentSum = 0; // current sum of array elements
// int sum = 0; // sum of elements of array between startIndex and endIndex
// int currentLengthOfArray = 1; // length of array from index 0 to endIndex
// int calculatedLengthOfArray = 1; // length calculating n * (n+1)/2
// while (currentLengthOfArray <= arrayLength) {
// if (currentLengthOfArray == calculatedLengthOfArray) {
// for (int index = startIndex; index <= endIndex; index++) {
// sum += a[index];
// }
// } else {
// // Fail ::: The length of a Madhav array must be n*(n+1)/2 for some n
// isMadhavArray = 0;
// break;
// }
// if ((currentSum == sum) || (startIndex == endIndex)) { // startIndex ==
// endIndex to satisfy initial
// // condition
// currentSum = sum;
// sum = 0;
// isMadhavArray = 1;
// } else {
// // Fail ::: The sum is not equal
// isMadhavArray = 0;
// break;
// }
// if (currentLengthOfArray == arrayLength) {
// // already at the end of the array
// break;
// } else {
// startIndex = endIndex + 1;
// endIndex = startIndex + n;
// if ((startIndex < arrayLength && endIndex < arrayLength)) {
// // operating inside the array bounderies
// n++;
// } else {
// // adjusting boundries; so that lastIndex points last element of array
// endIndex = arrayLength - 1;
// n = endIndex - startIndex;
// }
// calculatedLengthOfArray = n * (n + 1) / 2;
// currentLengthOfArray = endIndex + 1;
// }
// }
// return isMadhavArray;