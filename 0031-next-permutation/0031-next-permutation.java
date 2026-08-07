class Solution {
    public void nextPermutation(int[] nums) {
    int n = nums.length;
	int i = n-2; // marks the second last element
	
	while(i>=0 && nums[i]>=nums[i+1]){
	    i--;
	}
	
    if(i>=0){
	int j = n-1;
	while(nums[j]<=nums[i]){
		j--;
    }
	int temp = nums[j];
	nums[j] = nums[i];
	nums[i] = temp;
    }


	int start = i+1;
	int end = n-1;
	
	while(start<end){
		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;

		start++;
		end--;
        }	
    }
}