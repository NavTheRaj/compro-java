class IsSym {

    public static int isSym(int[] arr) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            if ((arr[first] % 2 == 0 && arr[last] % 2 == 0) || (arr[first] % 2 != 0 && arr[last] % 2 != 0)) {
                first++;
                last--;
            } else {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 2 };
        System.out.println(isSym(arr));
    }
}