class Fancy {

    public static int isFancy(int num) {

        int first = 1;
        int second = 1;

        if (num == first || num == second) {
            return 1;
        }

        int third = 2 * first + 3 * second;

        while (third <= num) {
            if (third == num)
                return 1;
            first = second;
            second = third;
            third = 2 * first + 3 * second;
        }

        return 0;
    }

    public static void main(String args[]) {
        int nums = -56;
        System.out.println(isFancy(nums) == 1 ? "True" : "False");
    }
}