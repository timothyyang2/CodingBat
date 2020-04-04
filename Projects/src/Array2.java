
public class Array2 {
	
	public static int countEvens(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static int bigDiff(int[] nums) {
		int max = nums[0];
		int min = nums[0];
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}else if(nums[i] < min) {
				min = nums[i];
			}
		}
		return (max-min);
	}
	
	public int centeredAverage(int[] nums) {
		  int max = nums[0];
			int min = nums[0];
			int sum = nums[0];
			for(int i = 1; i < nums.length; i++) {
				sum  += nums[i];
				if(nums[i] > max) {
					max = nums[i];
				}else if(nums[i] < min){
					min = nums[i];
				}
			}
			return (sum-max-min) / (nums.length - 2);
		}
	
	public int sum13(int[] nums) {
		int count = 0;
		for(int i=0; i<nums.length; i++){
			if(nums[i]!=13){
		    count = count + nums[i];
		    }else{
		    i++;
		    }
		  }
		  return count;
		}
	
	public int sum67

	public boolean has22(int[] nums) {
		  for(int i=0; i<nums.length-1; i++){
		    if(nums[i]==2 && nums[i+1]==2){
		      return true;
		    }
		  }
		  return false;
		}

	public boolean lucky13(int[] nums) {
		  for(int i=0; i<nums.length; i++){
		    if(nums[i]==1 || nums[i]==3){
		      return false;
		    }
		  }
		  return true;
		}

	public boolean sum28(int[] nums) {
		  int count = 0;
		  for(int i=0; i<nums.length; i++){
		    if(nums[i]==2){
		      count = count + nums[i];
		    }
		  }
		  if(count==8){
		    return true;
		  }
		  return false;
		}
	
	public boolean more14(int[] nums) {
		  int count = 0;
		  int count1 = 0;
		  for(int i=0; i<nums.length; i++){
		    if(nums[i]==1){
		      count++;
		    }else if(nums[i]==4){
		      count1++;
		    }
		  }
		  if(count>count1){
		    return true;
		  }
		  return false;
		}

	public int[] fizzArray(int n) {
		  int[] result = new int[n];
		  for(int i=0; i<result.length; i++){
		    result[i]=i;
		  }
		  return result;
		}

	public boolean only14(int[] nums) {
		  for(int i=0; i<nums.length; i++){
		    if(nums[i]!=1 && nums[i]!=4){
		      return false;
		    }
		  }
		  return true;
		}

	public String[] fizzArray2(int n) {
		  String[] result = new String[n];
		  for(int i=0; i<result.length; i++){
		    result[i] = String.valueOf(i);
		  }
		  return result;
		}
	
	
	
	public boolean no14(int[] nums) {
		boolean noOne = true, noFour = true;
		for(int i = 0; i < nums.length && (noOne || noFour); i++) {
			if(nums[i] == 1) {
				noOne = false;
			}else if(nums[i] == 4) {
				noFour = false;
			}
		}	
		return (noOne || noFour);
	}

	public boolean isEverywhere(int[] nums, int val) {
		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i] != val && nums[i+1] != val) {
				return false;
			}
		}
		return true;
	}
	
	public boolean either24(int[] nums) {
		int no2pair = 1, no4pair = 1;
		for(int i = 0; i < nums.length - 1 && (no2pair + no4pair != 0); i++) {
			if(nums[i] == 2 && nums[i+1] == 2) {
				no2pair = 0;
			}else if(nums[i] == 4 && nums[i+1] == 4) {
				no4pair = 0;
			}
		}
		return ((no2pair ^ no4pair) == 1);
	}


	public static void main(String[] args) {
		
	}

}
