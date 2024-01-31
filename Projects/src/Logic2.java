public class Logic2 {

    public boolean makeBricks(int small, int big, int goal) {
        if (goal / 5 <= big) {
            goal = goal - (goal / 5) * 5;
        } else {
            goal = goal - (big * 5);
        }
        if (goal - small <= 0) {
            return true;
        }
        return false;
    }

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

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        if (num % 10 >= 5) {
            num = num + (10 - (num % 10));
        } else {
            num = num - (num % 10);
        }
        return num;
    }

    public boolean closeFar(int a, int b, int c) {
        return (Math.abs(b - a) < 2 || Math.abs(b - c) < 2 || Math.abs(a - c) < 2)
                && ((Math.abs(a - c) >= 2 || Math.abs(a - b) >= 2) && Math.abs(b - c) >= 2);
    }

    public int blackjack(int a, int b) {
        if (b <= 21 && (a > 21 || Math.abs(21 - a) > Math.abs(21 - b))) {
            return b;
        } else if (a <= 21 && (b > 21 || Math.abs(21 - a) < Math.abs(21 - b))) {
            return a;
        }
        return 0;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        int small = a;
        int medium = b;
        int large = c;
        int temp = 0;
        if (small > medium) {
            small = b;
            medium = a;
        }
        if (medium > large) {
            temp = large;
            large = medium;
            medium = temp;
        }
        if (small > medium) {
            temp = medium;
            medium = small;
            small = temp;
        }
        if (Math.abs(small - medium) == Math.abs(large - medium)) {
            return true;
        }
        return false;
    }

    public int makeChocolate(int small, int big, int goal) {
        if (goal / 5 <= big) {
            goal = goal - (goal / 5) * 5;
        } else {
            goal = goal - (big * 5);
        }
        if (goal - small <= 0) {
            return goal;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
