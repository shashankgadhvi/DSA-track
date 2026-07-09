class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> Uniquenum = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(Uniquenum.contains(nums[i])){
                return true;
            }
            Uniquenum.add(nums[i]);
        }
        return false;
    }
}