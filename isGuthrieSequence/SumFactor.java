public class SumFactor {

    static int getSumFactor(int[] nums) {
        int sum = 0;
        int sumFactor = 0;

        if (nums.length == 0) {
            return sumFactor;
        }

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        System.out.println(sum);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == sum)
                sumFactor++;
        }

        return sumFactor;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 0 };
        System.out.println(getSumFactor(arr));
    }
}
