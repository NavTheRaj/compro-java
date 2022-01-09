class SquareSum {

    static int expressedAsSumOfTwoSquares(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (n == i * i + j * j) {
                    count++;
                    System.out.println(n + " = " + i + "^2 + " + j + "^2");
                    break;
                }
            }
        }

        if (count >= 2) {
            return 1;
        }

        return 0;
        // return n + " cannot be expressed as a sum of two squares";
    }

    public static void main(String[] args) {
        int num = 65;
        System.out.println(expressedAsSumOfTwoSquares(num));
    }
}