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

    public int[] fix45(int[] nums) {
        int i = 0;
        int j = 0;
        while (j < nums.length && nums[j] != 5) {
            j++;
        }
        while (i < nums.length) {
            if (nums[i] == 4) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[j];
                nums[j] = temp;

                while (j < nums.length && nums[j] != 5 || j == i + 1) {
                    j++;
                }
            }
            i++;
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

    public boolean linearIn(int[] outer, int[] inner) {
        int i = 0;
        int j = 0;
        while (i < inner.length && j < outer.length) {
            if (inner[i] > outer[j]) {
                j++;
            } else if (inner[i] < outer[j]) {
                return false;
            } else {
                i++;
            }
        }

        if (i != inner.length) {
            return false;
        }
        return true;
    }

    public int[] squareUp(int n) {
        int[] result = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1) {
                    continue;
                }
                result[i * n + j] = n - j;
            }
        }
        return result;
    }

    public int[] seriesUp(int n) {
        int current = 0;
        int[] result = new int[n * (n + 1) / 2];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                result[current + j] = j + 1;
            }
            current += i;
        }
        return result;
    }

    public int maxMirror(int[] nums) {
        int length = nums.length;
        int count = 0;
        int max = 0;
        for (int i = 0; i < length; i++) {
            count = 0;
            for (int j = length - 1; j >= 0 && i + count < length; j--) {
                if (nums[i + count] == nums[j]) {
                    count++;
                } else if (count > 0) {
                    max = Math.max(count, max);
                    count = 0;
                }
            }
            max = Math.max(count, max);
        }
        return max;
    }

    public int countClumps(int[] nums) {
        int count = 0;
        int length = 0;
        int index = 0;
        while (index < nums.length) {
            int current = nums[index];
            index++;
            while (index < nums.length && nums[index] == current) {
                length++;
                index++;
            }
            if (length > 0) {
                count++;
            }
            length = 0;
        }
        return count;
    }
}
