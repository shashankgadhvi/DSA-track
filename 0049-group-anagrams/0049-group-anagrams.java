class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] char_array = strs[i].toCharArray();
            Arrays.sort(char_array);
            String sorted_form_string = new String(char_array);
            List<String> list = map.getOrDefault(sorted_form_string,new ArrayList<>());
            list.add(strs[i]);
            map.put(sorted_form_string,list);
        }
    return new ArrayList(map.values());
    }
}