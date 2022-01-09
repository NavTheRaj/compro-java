class CountDigit {
    static int countDigit(int n, int digit) {
        int counter = 0;
        int singleDigit = 0;

        if (n < 0 || digit < 0)
            return 0;

        while (n > 0) {
            singleDigit = n % 10;
            n = n / 10;

            if (singleDigit == digit)
                counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        int num = -1;
        int digit = 3;

        System.out.println(countDigit(num, digit));
    }
}