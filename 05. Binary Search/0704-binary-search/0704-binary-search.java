class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left=0,right=n-1,mid;
        for(int i=0;i<n;i++){
        while(left<=right){
            mid = (right+left)/2;
            if(nums[mid]<target){
                left = mid+1;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                return mid;
            }
        }
    }
    return -1;
    }
}