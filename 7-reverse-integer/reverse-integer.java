class Solution {
    public int reverse(int x) {
        long y = 0;
        int c = 0;
        while (x != 0) {
            int a = x % 10;
            y = (long) y * 10 + a;
            x = x / 10;
        }
        if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) y;

    }
}