class CountDigits {

    public static int countDigits(int num) {

        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (countDigits(nums[i]) % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1 };

        // System.out.println(findNumbers(nums));
        System.out.println(1  10);
    }

}