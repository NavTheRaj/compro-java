public class RevereseNum {

    static int reverseNum(int num) {
        int isNegative = 0;
        if (num < 0) {
            isNegative = 1;
            num = num * (-1);
        }

        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return (isNegative == 1) ? rev * (-1) : rev;
    }

    public static void main(String[] args) {
        int num = -12345;
        System.out.println(reverseNum(num));
    }
}
