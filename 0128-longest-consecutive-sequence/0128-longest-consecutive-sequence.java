class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int currentcount=1;
        int bestcount;
        if(nums.length==0){
            bestcount=0;
        }
        else{bestcount=1;}

        for(int i=0;i<(nums.length-1);i++){
            if(nums[i]+1==nums[i+1]){
                currentcount+=1;
                bestcount = Math.max(bestcount,currentcount);
            }
            else if(nums[i]==nums[i+1]){
                continue;
            }
            else{
                currentcount=1;
            }
        }
    return bestcount;
    }
}