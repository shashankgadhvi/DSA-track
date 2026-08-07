class Solution {
    public void nextPermutation(int[] nums) {
        // ex - 1 2 3  -> length = 3
        // i is index 1 suppose so 2, i+1 is 3 so 3>2 from right to left it dropped
        // to get 2, we do 3-2 = 1 index of 2
        int n = nums.length;
        int i = n-2;

        // we got the length and i pointer which is the second last element
        // to check with right element big or small for further
        // now we want to find the dip/pivot, where the nums[i]<nums[i+1]

        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        if(i>=0){
            int j = n-1; // marks the last element
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