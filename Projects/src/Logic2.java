public class Logic2 {

    public int loneSum(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        }
        if (b == c) {
            return a;
        }
        if (a == c) {
            return b;
        }
        if (a == b) {
            return c;
        }
        return a + b + c;
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        }
        return a + b + c;
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n) {
        if (n >= 13 && n < 15 || n > 16 && n <= 19) {
            return 0;
        }
        return n;
    }

    public boolean closeFar(int a, int b, int c) {
        return (Math.abs(b - a) < 2 || Math.abs(b - c) < 2 || Math.abs(a - c) < 2)
                && ((Math.abs(a - c) >= 2 || Math.abs(a - b) >= 2) && Math.abs(b - c) >= 2);
    }

    public static void main(String[] args) {

    }
}
