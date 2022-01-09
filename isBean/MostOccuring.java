public class MostOccuring {

    static int getMostOccuring(int[] n) {
        int len = n.length;

        int num = n[0];
        int curCount = 0;
        int pCount = 0;
        for (int i = 0; i < len; i++) {

            for (int j = 0; j < len; j++) {
                if (n[i] == n[j]) {
                    curCount++;
                }
            }
            if (curCount > pCount) {
                num = n[i];
                pCount = curCount;
            }

            curCount = 0;
        }
        return num;
    }

    public static void main(String[] args) {
        int[] num = { 1, 1, 1, 2, 2, 2, 2, 2 };
        System.out.println(getMostOccuring(num));
    }
}
