class Solution {
    public void nextPermutation(int[] nums) {
        int pivotindex = -1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivotindex = i;
                break;
            }
        }
        if(pivotindex!=-1){
            for(int j=nums.length-1;j>pivotindex;j--){
                if(nums[pivotindex]<nums[j]){
                    int temp = nums[pivotindex];
                    nums[pivotindex] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }
        
        int start = pivotindex + 1;
        int end = nums.length - 1;

        while(end>start){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}