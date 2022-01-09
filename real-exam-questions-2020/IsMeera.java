class IsMeera {

    static int isMeeraArray(int[] a) {

        // if (a.length == 0)
        // return 0;

        int isMeeraArray = 1;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == 2 * a[j]) {
                    isMeeraArray = 0;
                    return 0;
                    // break;
                }
            }
        }
        return isMeeraArray;
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(isMeeraArray(arr));
    }
}