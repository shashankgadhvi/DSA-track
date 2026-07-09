class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int[] result = new int[k];
        
        for(int i=0;i<nums.length;i++){
            int count = map.getOrDefault(nums[i],0);
            map.put(nums[i],(count+1));

            // now we need to convert it into a map entry to handle it 
            // map.entrySet();

            // now we need to convert this entryset into a list for sorting
            // normal syntax for list of integers is List<Integer>
            // for list of key value pairs where Integer,Integer we have here
            // syntax is- List<Map.Entry<Integer,Integer>> 
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (a,b) -> b.getValue() - a.getValue());

        for(int i=0;i<k;i++){
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}
