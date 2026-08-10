class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left=0;
        HashMap<Character,Integer> map = new HashMap<>();
        int maxlength=0,maxfrequency=0;

        for(int right=0;right<n;right++){

            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);

            maxfrequency = Math.max(maxfrequency,map.get(s.charAt(right)));

            while((right-left+1)-maxfrequency>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }

            maxlength = Math.max(maxlength,right-left+1);        
    }
    return maxlength;
    }
}