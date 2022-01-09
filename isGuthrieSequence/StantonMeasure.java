public class StantonMeasure {

    static int getStantonMeasure(int[] nums) {
        int oneCounter = 0;
        int statCounter = 0;

        // if (nums.length == 0) {
        // return statCounter;
        // }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                oneCounter++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == oneCounter)
                statCounter++;
        }

        return statCounter;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };
        System.out.println(getStantonMeasure(arr));
    }
}
