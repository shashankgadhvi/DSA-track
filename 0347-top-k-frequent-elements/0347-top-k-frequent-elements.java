class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //frequency counting, so we use hashmaps naturally
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1); // we have now put all elements in hashmap with frequency
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        int[] result = new int[k];

        list.sort((a,b) -> b.getValue()-a.getValue()); // descending sort very typical syntax

        for(int i=0;i<k;i++){
            result[i] = list.get(i).getKey();
        }
    return result;
    }
}
