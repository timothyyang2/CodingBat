
public class Array1 {
	
	public static boolean firstLast6(int[] nums) {
		if(nums[0]==6 || nums[nums.length-1]==6) {
			return true;
		}
		return false;
	}

	public static boolean sameFirstLast(int[] nums) {
		if(nums.length==1) {
			return true;
		}
		if(nums.length<2) {
		    return false;
		}
		if(nums[0]== nums[nums.length-1]) {
		    return true;
		}
		return false;
	}
	
	public static int[] makePi() {
		int[] pi = new int[]{3,1,4};
		return pi;
	}
	
	public static boolean commonEnd(int[] a, int[] b) {
		if(a[0]==b[0] || a[a.length-1]==b[b.length-1]) {
			return true;
		}
		return false;
	}
	
	public static int sum3(int[] nums) {
		return nums[0]+nums[1]+nums[2];
	}
	
	public static int[] rotateLeft3(int[] nums) {
		int[] result = new int[]{nums[1],nums[2],nums[0]};
		return result;
	}

	public static int[] reverse3(int[] nums) {
		int[] result = new int[]{nums[2],nums[1],nums[0]};
		return result;
	}

	public static int[] maxEnd3(int[] nums) {
		int max = nums[0];
		if(nums[0]>nums[1]) {
		    max = nums[0];
		}
		if(nums[2]>nums[0]) {
		    max = nums[2];
		}
		int[] result = new int[]{max,max,max};
		return result;
	}
	
	public static int sum2(int[] nums) {
		int count = 0;
		if(nums.length<2) {
		  for(int i=0; i<nums.length; i++) {
			  count = count + nums[i];
		  }
		}else{
			  count = nums[0]+nums[1];
		}
		return count;
	}

	public static int[] middleWay(int[] a, int[] b) {
		int[] result = new int[]{a[a.length/2],b[b.length/2]};
		return result;
	}
	
	public static int[] makeEnds(int[] nums) {
		int[] result = new int[]{nums[0],nums[nums.length-1]};
		return result;
	}

	public static boolean has23(int[] nums) {
		if(nums[0]==2 || nums[1]==2 || nums[0]==3 || nums[1]==3) {
			return true;
		}
		return false;
	}
	
	public static boolean no23(int[] nums) {
		if(nums[0]==2 || nums[1]==2 || nums[0]==3 || nums[1]==3) {
			return false;
		}
		return true;
	}

	public static int[] makeLast(int[] nums) {
		int[] result = new int[nums.length*2];
		result[result.length-1] = nums[nums.length-1];
		return result;
	}
	
	public static boolean double23(int[] nums) {
		if(nums.length<2) {
			return false;
		}
		if(nums[0]==2 && nums[1]==2 || nums[0]==3 && nums[1]==3) {
			return true;
		}
		return false;
	}

	public static int[] fix23(int[] nums) {
		if(nums[0]==2 && nums[1]==3) {
			nums[1] = 0;
		}
		if(nums[1]==2 && nums[2]==3) {
		    nums[2] = 0;
		}
		return nums;
	}
	
	public static int start1(int[] a, int[] b) {
		if(a.length==0 && b.length==0) {
		    return 0;
		}
		if(a.length>0 && b.length>0) {
		  if(a[0]==1 && b[0]==1) {
			  return 2;
		  }else if(a[0]!=1 && b[0]==1 || a[0]==1 && b[0]!=1) {
		      return 1;
		  }
		}
		if(a.length==0) {
			if(b[0]==1) {
			  return 1;
		    }
		}
		if(b.length==0) {
			if(a[0]==1) {
		      return 1;
		    }
		}
		return 0;
	}
	
	public static int[] biggerTwo(int[] a, int[] b) {
		int s1 = a[0]+a[1];
		int s2 = b[0]+b[1];
		if(s1==s2) {
			return a;
		}
		if(s1>s2) {
		    return a;
		}
		return b;
	}

	public static int[] makeMiddle(int[] nums) {
		int[] result = new int[]{nums[nums.length/2-1],nums[nums.length/2]};
		return result;
	}
	
	public static int[] plusTwo(int[] a, int[] b) {
		int[] result = new int[]{a[0],a[1],b[0],b[1]};
		return result;
	}

	public static int[] swapEnds(int[] nums) {
		int[] result = new int[nums.length];
		result[0] = nums[nums.length-1];
		result[result.length-1] = nums[0];
		for(int i=1; i<nums.length-1; i++) {
			result[i] = nums[i];
		}
		return result;
	}
	
	public static int[] midThree(int[] nums) {
		int[] result = new int[]{nums[nums.length/2-1],nums[nums.length/2],nums[nums.length/2+1]};
		return result;
	}
	
	public static int maxTriple(int[] nums) {
		int max = nums[0];
		if(max <= nums[nums.length-1])
			max = nums[nums.length-1];
		if(max <= nums[nums.length/2])
			max = nums[nums.length/2];
		return max;
	}
	
	public static int[] frontPiece(int[] nums) {
		if(nums.length<2) {
		    return nums;
		}
		int[] result = new int[]{nums[0],nums[1]};
		return result;
	}

	public static boolean unlucky1(int[] nums) {
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i]==1 && nums[i+1]==3 && (i==0 || i==1 || i==nums.length-2)) {
		      return true;
		    }
		}
		return false;
	}
	
	public static int[] make2(int[] a, int[] b) {
		int[] both = new int[a.length+b.length];
		for(int i=0; i<a.length; i++) {
		    both[i]=a[i];
		}
		for(int i=a.length; i<both.length; i++) {
			both[i]=b[i-a.length];
		}
		int[] comb = new int[]{both[0],both[1]};
		return comb;
	}
	
	public static int[] front11(int[] a, int[] b) {
		int[] result;
		if(a.length==0 && b.length!=0) {
			result = new int[1];
		    result[0]=b[0];
		}else if(b.length==0 && a.length!=0) {
		    result = new int[1];
		    result[0]=a[0];
		}else if(b.length!=0 && a.length!=0) {
		    result = new int[2];
		    result[0]=a[0];
		    result[1]=b[0];
		}else{
		    result = new int[0];
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(makePi());
	}

}
