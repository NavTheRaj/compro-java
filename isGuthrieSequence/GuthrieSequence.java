class GuthrieSequence {

    static int isGuthrieSequence(int[] nums) {
        int isGuthrieSequence = 0;
        if (nums[nums.length - 1] != 1)
            return isGuthrieSequence;

        int guthrieNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (guthrieNum == nums[i]) {
                isGuthrieSequence = 1;
            } else {
                isGuthrieSequence = 0;
                break;
            }

            if (nums[i] % 2 == 0) {
                guthrieNum = nums[i] / 2;
            } else {
                guthrieNum = nums[i] * 3 + 1;
            }
        }

        return isGuthrieSequence;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1 };
        System.out.println(isGuthrieSequence(arr));
    }
}