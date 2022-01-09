public class IsMeera {

    static int isMeera(int[] arr) {

        int containsOne = 0;
        int containsNine = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                containsOne = 1;
            if (arr[i] == 9)
                containsNine = 1;

            if (containsOne == 1 && containsNine == 1) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 9 };
        System.out.println(isMeera(arr));

    }

}
