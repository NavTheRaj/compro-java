class Bean {

    public static int isBean(int[] n) {
        int len = n.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (n[i] == 2 * n[j] || n[i] == n[j] / 2 || n[i] == 2 * n[j] + 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
        return (count >= len) ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 8, 4 };
        System.out.println(isBean(arr));
    }
}