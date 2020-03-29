
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

	public static void main(String[] args) {
		
	}

}
