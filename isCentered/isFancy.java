class IsFancy {

    static int isFancy(int num) {

        int first = 1;
        int second = 1;
        int current = 3 * second + 2 * first;

        if (num == first || num == second) {
            return 1;
        }

        while (current <= num) {
            if (current == num) {
                return 1;
            }

            first = second;
            second = current;
            current = 3 * second + 2 * first;

            System.out.println(first + "\t" + second + "\t" + current);
        }

        return 0;
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(isFancy(num));
    }
}