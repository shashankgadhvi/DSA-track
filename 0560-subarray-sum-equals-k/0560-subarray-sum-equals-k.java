class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int n = nums.length;
        int currentsum=0, count=0;
        hashmap.put(0,1);
        for(int i=0;i<n;i++){
            currentsum = currentsum + nums[i]; 
            if(hashmap.containsKey(currentsum-k)){
                count = count + hashmap.get(currentsum-k);
            }
            hashmap.put(currentsum,hashmap.getOrDefault(currentsum,0)+1);
        }
    return count;
    }
}