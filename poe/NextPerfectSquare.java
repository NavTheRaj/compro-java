public class NextPerfectSquare {

    static int getNextPerfectSquare(int num) {

        int nextPerfectSquare = num + 1;

        while (Math.sqrt(nextPerfectSquare) % 1 != 0) {
            nextPerfectSquare++;
        }

        return nextPerfectSquare;
    }

    public static void main(String[] args) {
        int num = 81;
        System.out.println(getNextPerfectSquare(num));
    }
}
