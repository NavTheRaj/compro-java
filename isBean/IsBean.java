public class IsBean {

    static int isBean(int[] arr) {
        int beanCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j] || arr[i] == 2 * arr[j] + 1 || arr[i] == arr[j] / 2) {
                    beanCount++;
                    break;
                }
            }

        }

        System.out.println(beanCount);

        if (beanCount == arr.length)
            return 1;

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 3 };
        System.out.println(isBean(arr));
    }
}
