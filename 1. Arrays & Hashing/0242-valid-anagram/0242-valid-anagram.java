class Solution {
    public boolean isAnagram(String s, String t) {
          if(s.length()!=t.length()) return false;

        HashMap<Character,Integer> commonfrequencymap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            commonfrequencymap.put(c,commonfrequencymap.getOrDefault(c,0)+1);
        }

        for(int j=0;j<t.length();j++){
            char c = t.charAt(j);
            commonfrequencymap.put(c,commonfrequencymap.getOrDefault(c,0)-1);

            if(commonfrequencymap.get(c)<0) return false;
        }

        return true;
    }
}