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

    public boolean splitArray(int[] nums) {
        return splitArrayHelper(0, nums, 0, 0);
    }

    public boolean splitArrayHelper(int index, int[] nums, int sum1, int sum2) {
        if (index >= nums.length) {
            return sum1 == sum2;
        }
        if (splitArrayHelper(index + 1, nums, sum1 + nums[index], sum2)
                || splitArrayHelper(index + 1, nums, sum1, sum2 + nums[index])) {
            return true;
        }
        return false;
    }

    public boolean splitOdd10(int[] nums) {
        return splitOdd10Helper(0, nums, 0, 0);
    }

    public boolean splitOdd10Helper(int index, int[] nums, int sum1, int sum2) {
        if (index >= nums.length) {
            return (sum1 % 10 == 0 && sum2 % 2 != 0) || (sum2 % 10 == 0 && sum1 % 2 != 0);
        }
        if (splitOdd10Helper(index + 1, nums, sum1 + nums[index], sum2)
                || splitOdd10Helper(index + 1, nums, sum1, sum2 + nums[index])) {
            return true;
        }
        return false;
    }

    public boolean split53(int[] nums) {
        return split53Helper(0, nums, 0, 0);
    }

    public boolean split53Helper(int index, int[] nums, int sum1, int sum2) {
        if (index >= nums.length) {
            return sum1 == sum2;
        }
        if (nums[index] % 3 == 0) {
            return split53Helper(index + 1, nums, sum1 + nums[index], sum2);
        }
        if (nums[index] % 5 == 0) {
            return split53Helper(index + 1, nums, sum1, sum2 + nums[index]);
        }
        if (split53Helper(index + 1, nums, sum1 + nums[index], sum2)
                || split53Helper(index + 1, nums, sum1, sum2 + nums[index])) {
            return true;
        }
        return false;
    }
}
