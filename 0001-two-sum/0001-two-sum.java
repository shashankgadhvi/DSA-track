class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int current = nums[i];
            int needed = target - current;
            if(map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }
            else{
                map.put(current,i);
            }
        }
    return new int[]{};
    }
}