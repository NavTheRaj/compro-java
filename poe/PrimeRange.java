public class PrimeRange {

    static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;

            }

        }
        return isPrime;
    }

    static int getPrimeCount(int start, int end) {
        int primeCount = 0;

        while (start <= end) {
            if (isPrime(start)) {
                primeCount++;
                // System.out.println(start);
            }
            start++;
        }

        return primeCount;
    }

    public static void main(String[] args) {
        int start = -10;
        int end = 6;

        System.out.println(getPrimeCount(start, end));
    }
}
