public class Recursion2 {

    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (groupSum(start + 1, nums, target - nums[start])) {
            return true;
        }
        if (groupSum(start + 1, nums, target)) {
            return true;
        }
        return false;
    }

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - nums[start]);
        }
        if (groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target)) {
            return true;
        }
        return false;
    }

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (groupNoAdj(start + 2, nums, target - nums[start])) {
            return true;
        }
        if (groupNoAdj(start + 1, nums, target)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
