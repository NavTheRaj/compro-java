public class Meera {
    public static int isMeera(int[] a) {

        int one = 0;
        int nine = 0;

        for (Integer num : a) {
            if (num == 1)
                one = 1;
            if (num == 9)
                nine = 1;

            if (one == 1 && nine == 1) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 8, 0, 9, 9, 1 };
        // {6,10,8}
        // {7,6,1}
        // {9,10,0}
        // {1,1,0,8,0,9,9,1}

        System.out.println(isMeera(arr));

    }
}
