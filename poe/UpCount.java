class UpCount {

    static int getUpCount(int[] arr, int n) {
        int upCount = 0;
        int previousSum = 0;
        int partialSum = 0;

        for (int num : arr) {
            previousSum = partialSum;
            partialSum += num;

            if (previousSum <= partialSum && partialSum > n) {
                System.out.println(previousSum + "\t" + partialSum);
                upCount++;
            }

        }

        return upCount;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, -6, 8, -3, -1, 2 };
        System.out.println(getUpCount(arr, 5));

    }
}