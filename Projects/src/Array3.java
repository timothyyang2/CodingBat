public class Array3 {

    public int maxSpan(int[] nums) {
        int max = 1;
        int current = 0;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] == nums[j]) {
                    current = j - i + 1;
                }
                if (current > max) {
                    max = current;
                }
            }
        }
        return max;
    }

    public int[] fix34(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                for (int j = i; j > 0; j--) {
                    if (nums[j] == 4 && nums[j - 1] != 3) {
                        temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                    }
                }
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }

    public boolean canBalance(int[] nums) {
        int first = 0;
        int second = 0;
        for (int i = 0; i < nums.length; i++) {
            first += nums[i];
        }
        for (int j = 0; j < nums.length; j++) {
            second += nums[j];
            first -= nums[j];
            if (first == second) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
