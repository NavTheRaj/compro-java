class IsCentered {

    static int isCentered(int[] arr) {

        if (arr.length % 2 == 0 || arr.length == 0) {
            return 0;
        }

        int midIdx = arr.length / 2;

        int midNum = arr[midIdx];

        for (int i = 0; i < arr.length; i++) {
            if (i != midIdx && arr[i] < midNum) {
                return 0;
            }

        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 10, 4, 5 };
        System.out.println(isCentered(arr));
    }
}