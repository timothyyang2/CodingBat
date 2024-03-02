public class Recursion2 {

    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target)) {
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

    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (nums[start] % 5 == 0 && start + 1 < nums.length && nums[start + 1] == 1) {
            return groupSum5(start + 2, nums, target - nums[start]);
        }
        if (nums[start] % 5 == 0) {
            return groupSum5(start + 1, nums, target - nums[start]);
        }
        if (groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target)) {
            return true;
        }
        return false;
    }

    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        int index = start;
        int sum = 0;
        while (index < nums.length && nums[start] == nums[index]) {
            sum += nums[index];
            index++;
        }
        if (groupSumClump(index, nums, target - sum) || groupSumClump(index, nums, target)) {
            return true;
        }
        return false;
    }
}
