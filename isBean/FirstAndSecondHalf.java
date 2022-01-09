public class FirstAndSecondHalf {

    static int isNavraj(int[] n) {
        int len = n.length;

        if (len % 2 != 0) {
            return 0;
        }

        int first = 0;
        int second = 0;

        for (int i = 0; i < len; i++) {
            if (i < len / 2) {
                first = first + n[i];
            } else {
                second = second + n[i];
            }
        }

        return (first == second) ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] num = { 5, 4, 3, 2, 3, 4, 6, 8 };
        System.out.println(isNavraj(num));
    }
}
