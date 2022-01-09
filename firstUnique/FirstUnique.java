class FirstUnique {
    public static int firstUniqChar(String s) {
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (s.indexOf(a[i]) == s.lastIndexOf(a[i])) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
