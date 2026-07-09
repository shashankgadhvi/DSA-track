class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
           char[] chars = strs[i].toCharArray();
           Arrays.sort(chars); // we sort the given iterating element of array
           String sorted= new String(chars);
           List<String> list = map.getOrDefault(sorted,new ArrayList<>());
           list.add(strs[i]);
           map.put(sorted,list);
        }
        return new ArrayList(map.values());
    }
}