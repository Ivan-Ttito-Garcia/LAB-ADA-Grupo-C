
public class NumberOfLongestIncreasing {
	public static void main(String arg[]) {
		
		int[] a = {0,1,0,3,2,3};
		
		System.out.println(lengthOfLIS(a));
		
	}
	public static int lengthOfLIS(int[] nums) {
		
		int length = nums.length;
		
		if(length == 0)
			return 0;
		
		int max = 1;
		
		int[] registro = new int[length];
		
		for (int i = 0; i < length; i++) {
			
			registro[i]=1;
			
			for (int j = 0; j < i; j++)
				if(nums[j]<nums[i]) {
					
					if(registro[i]<=registro[j]+1)
						registro[i]=registro[j]+1;
					
					if(max < registro[i])
						max = registro[i];
				}
			
		}
		
		return max;
	}
}
