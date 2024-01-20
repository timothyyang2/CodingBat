public class Array2 {

    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return max - min;
    }

    public int centeredAverage(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
            total += nums[i];
        }
        return (total - max - min) / (nums.length - 2);
    }

    public int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) {
                sum += nums[i];
            } else {
                i++;
            }
        }
        return sum;
    }

    public int sum67(int[] nums) {
        int sum = 0;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 6 && index == -1) {
                sum += nums[i];
            }
            if (nums[i] == 6) {
                index = i;
            }
            if (nums[i] == 7) {
                index = -1;
            }
        }
        return sum;
    }

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum += 2;
            }
        }
        return sum == 8;
    }

    public boolean more14(int[] nums) {
        int one = 0;
        int four = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                one++;
            }
            if (nums[i] == 4) {
                four++;
            }
        }
        return one > four;
    }

    public int[] fizzArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                return false;
            }
        }
        return true;
    }

    public String[] fizzArray2(int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toString(i);
        }
        return result;
    }

    public boolean no14(int[] nums) {
        int one = 0;
        int four = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                one++;
            }
            if (nums[i] == 4) {
                four++;
            }
        }
        if (one == 0 || four == 0) {
            return true;
        }
        return false;
    }

    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
    }

    public boolean either24(int[] nums) {
        int countTwo = 0;
        int countFour = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                countTwo++;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                countFour++;
            }
        }
        if (countTwo != 0 && countFour != 0 || countTwo == 0 && countFour == 0) {
            return false;
        }
        return true;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) <= 2 && Math.abs(nums1[i] - nums2[i]) != 0) {
                count++;
            }
        }
        return count;
    }

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] == 7 && nums[i + 1] == 7) || (nums[i] == 7 && nums[i + 2] == 7)
                    || (nums[i + 1] == 7 && nums[i + 2] == 7)) {
                return true;
            }
        }
        return false;
    }

    public boolean has12(int[] nums) {
        int count = 0;
        int indexOne = 0;
        int indexTwo = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                indexOne = i;
                count++;
            }
            if (nums[i] == 2) {
                indexTwo = i;
            }
        }
        return count != 0 && indexTwo > indexOne;
    }

    public static void main(String[] args) {

    }
}
