public class Recursion1 {

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return bunnyEars(bunnies - 1) + 2;
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 == 0) {
            return bunnyEars2(bunnies - 1) + 3;
        } else {
            return bunnyEars2(bunnies - 1) + 2;
        }
    }

    public int triangle(int rows) {
        if (rows == 0) {
            return 0;
        }
        return triangle(rows - 1) + rows;
    }

    public int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return sumDigits(n / 10) + n % 10;
    }

    public int count7(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return count7(n / 10) + 1;
        }
        return count7(n / 10);
    }

    public int count8(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 8 && n % 100 == 88) {
            return count8(n / 10) + 2;
        }
        if (n % 10 == 8) {
            return count8(n / 10) + 1;
        }
        return count8(n / 10);
    }

    public int powerN(int base, int n) {
        if (base < 1 && n < 1) {
            return 0;
        }
        if (n == 1) {
            return base;
        }
        return powerN(base, n - 1) * base;
    }

    public int countX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(str.length() - 1) == 'x') {
            return countX(str.substring(0, str.length() - 1)) + 1;
        }
        return countX(str.substring(0, str.length() - 1));
    }

    public int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(str.length() - 2, str.length()).equals("hi")) {
            return countHi(str.substring(0, str.length() - 1)) + 1;
        }
        return countHi(str.substring(0, str.length() - 1));
    }

    public String changeXY(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(str.length() - 1) == 'x') {
            return changeXY(str.substring(0, str.length() - 1)) + "y";
        }
        return changeXY(str.substring(0, str.length() - 1)) + str.charAt(str.length() - 1);
    }

    public String changePi(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.substring(0, 2).equals("pi")) {
            return "3.14" + changePi(str.substring(2));
        } else {
            return str.substring(0, 1) + changePi(str.substring(1));
        }
    }

    public String noX(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            return noX(str.substring(1));
        }
        return str.substring(0, 1) + noX(str.substring(1));
    }

    public boolean array6(int[] nums, int index) {
        if (nums.length == index) {
            return false;
        }
        if (nums[index] == 6) {
            return true;
        }
        return array6(nums, index + 1);
    }

    public int array11(int[] nums, int index) {
        if (nums.length == index) {
            return 0;
        }
        if (nums[index] == 11) {
            return array11(nums, index + 1) + 1;
        }
        return array11(nums, index + 1);
    }

    public boolean array220(int[] nums, int index) {
        if (nums.length == 0 || nums.length == index + 1) {
            return false;
        }
        if (nums[index + 1] == nums[index] * 10) {
            return true;
        }
        return array220(nums, index + 1);
    }

    public String allStar(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str.substring(0, 1);
        }
        return str.substring(0, 1) + "*" + allStar(str.substring(1));
    }

    public static void main(String[] args) {

    }
}
