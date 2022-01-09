public class EvenSpaced {

    static int isEvenSpaced(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int diff = 0;

        if (nums.length < 2) {
            return diff;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];

            if (nums[i] < min)
                min = nums[i];
        }

        System.out.println("Max: " + max + "\tMin: " + min);

        diff = max - min;

        return (diff % 2 == 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] arr = { 80, -56, 11, -81 };
        System.out.println(isEvenSpaced(arr));
    }
}
