public class SubArray {

    static int isSubArray(int[] nums) {
        int isSubArray = 1;

        if (nums == null || nums.length < 2) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            int innerSum = 0;
            for (int j = i + 1; j < nums.length; j++) {
                innerSum += nums[j];
            }

            if (innerSum > nums[i]) {
                System.out.println(innerSum);
                isSubArray = 0;
                break;
            }
        }

        return isSubArray;
    }

    public static void main(String[] args) {
        int[] arr = { 13, 8, 3, 2 };
        System.out.println(isSubArray(arr));
    }
}
