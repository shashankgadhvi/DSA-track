class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int temp = target - numbers[i];
            if(map.containsKey(temp)){
                return new int[]{map.get(temp)+1,i+1};
            }
            else{
                map.put(numbers[i],i);
            }
        }
    return new int[]{};
    }
}