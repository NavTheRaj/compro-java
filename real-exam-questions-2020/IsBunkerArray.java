class IsBunkerArray {

    static int isPrime(int num) {
        if (num < 2)
            return 0;

        int isPrime = 0;

        for (int i = 2; i <= num / 2; i++) {
            isPrime = 1;
            if (num % i == 0) {
                isPrime = 0;
                break;
            }
        }
        return isPrime;
    }

    static int isBunkerArray(int[] a) {
        int isBunkerArray = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 != 0) {
                if (isPrime(a[i + 1]) == 1) {
                    isBunkerArray = 1;
                    break;
                }
            }
        }
        return isBunkerArray;
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(isBunkerArray(arr));
    }
}