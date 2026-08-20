class Solution {
    public int maxSubArray(int[] nums) {
        // we have in our plate two things
        // currentsum and maxsum
        int n = nums.length;
        int currentsum=nums[0],maxsum=nums[0];

        for(int i=1;i<n;i++){
            if(currentsum<0){
                currentsum = nums[i];
            }
            else{
                currentsum = currentsum + nums[i];
            }
            if(currentsum>maxsum){
                maxsum = currentsum;
            }
        }
    return maxsum;
    }
}
