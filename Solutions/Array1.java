
public class Array1 {

	public boolean firstLast6(int[] nums) {
		if (nums[0] == 6 || nums[nums.length - 1] == 6) {
			return true;
		}
		return false;
	}

	public boolean sameFirstLast(int[] nums) {
		if (nums.length > 0 && nums[0] == nums[nums.length - 1]) {
			return true;
		}
		return false;
	}

	public int[] makePi() {
		int[] pi = { 3, 1, 4 };
		return pi;
	}

	public boolean commonEnd(int[] a, int[] b) {
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		}
		return false;
	}

	public int sum3(int[] nums) {
		return nums[0] + nums[1] + nums[2];
	}

	public int[] rotateLeft3(int[] nums) {
		int[] rotate = { nums[1], nums[2], nums[0] };
		return rotate;
	}

	public int[] reverse3(int[] nums) {
		int[] reverse = { nums[2], nums[1], nums[0] };
		return reverse;
	}

	public int[] maxEnd3(int[] nums) {
		int max = nums[0];
		if (nums[0] > nums[nums.length - 1]) {
			max = nums[0];
		} else {
			max = nums[nums.length - 1];
		}
		int[] result = { max, max, max };
		return result;
	}

	public int sum2(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		}
		return nums[0] + nums[1];
	}

	public int[] middleWay(int[] a, int[] b) {
		int[] result = { a[1], b[1] };
		return result;
	}

	public int[] makeEnds(int[] nums) {
		int[] result = { nums[0], nums[nums.length - 1] };
		return result;
	}

	public boolean has23(int[] nums) {
		if (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3) {
			return true;
		}
		return false;
	}

	public boolean no23(int[] nums) {
		if (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3) {
			return false;
		}
		return true;
	}

	public int[] makeLast(int[] nums) {
		int[] result = new int[nums.length * 2];
		result[result.length - 1] = nums[nums.length - 1];
		return result;
	}

	public boolean double23(int[] nums) {
		if (nums.length > 1) {
			if (nums[0] == 2 && nums[1] == 2) {
				return true;
			}
			if (nums[0] == 3 && nums[1] == 3) {
				return true;
			}
		}
		return false;
	}

	public int[] fix23(int[] nums) {
		if (nums[0] == 2 && nums[1] == 3) {
			nums[1] = 0;
			return nums;
		}
		if (nums[1] == 2 && nums[2] == 3) {
			nums[2] = 0;
			return nums;
		}
		return nums;
	}

	public int start1(int[] a, int[] b) {
		int count = 0;
		if (a.length > 0 && a[0] == 1) {
			count++;
		}
		if (b.length > 0 && b[0] == 1) {
			count++;
		}
		return count;
	}

	public int[] biggerTwo(int[] a, int[] b) {
		if (a[0] + a[1] >= b[0] + b[1]) {
			return a;
		}
		return b;
	}

	public int[] makeMiddle(int[] nums) {
		int[] result = { nums[nums.length / 2 - 1], nums[nums.length / 2] };
		return result;
	}

	public int[] plusTwo(int[] a, int[] b) {
		int[] result = { a[0], a[1], b[0], b[1] };
		return result;
	}

	public int[] swapEnds(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;
		return nums;
	}

	public int[] midThree(int[] nums) {
		int[] result = { nums[nums.length / 2 - 1], nums[nums.length / 2], nums[nums.length / 2 + 1] };
		return result;
	}

	public int maxTriple(int[] nums) {
		if (nums[0] > nums[nums.length / 2]) {
			if (nums[0] > nums[nums.length - 1]) {
				return nums[0];
			}
		} else if (nums[nums.length / 2] > nums[0]) {
			if (nums[nums.length / 2] > nums[nums.length - 1]) {
				return nums[nums.length / 2];
			}
		}
		return nums[nums.length - 1];
	}

	public int[] frontPiece(int[] nums) {
		if (nums.length < 2) {
			return nums;
		}
		int[] result = { nums[0], nums[1] };
		return result;
	}

	public boolean unlucky1(int[] nums) {
		if (nums.length > 1) {
			if ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3)
					|| (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)) {
				return true;
			}
		}
		return false;
	}

	public int[] make2(int[] a, int[] b) {
		if (a.length > 1) {
			int[] result = { a[0], a[1] };
			return result;
		} else if (a.length <= 1 && a.length > 0) {
			int[] result = { a[0], b[0] };
			return result;
		} else {
			return b;
		}
	}

	public int[] front11(int[] a, int[] b) {
		if (a.length == 0 && b.length == 0) {
			return new int[] {};
		}
		if (a.length == 0) {
			return new int[] { b[0] };
		}
		if (b.length == 0) {
			return new int[] { a[0] };
		}
		return new int[] { a[0], b[0] };
	}
}
