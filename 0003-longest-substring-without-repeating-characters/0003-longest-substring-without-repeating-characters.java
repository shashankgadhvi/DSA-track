class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Integer> set = new HashSet<>();
        int left=0,right=0;
        int maxlength=0;

        while(right<n){
            while(set.contains((int) s.charAt(right))){
                set.remove((int) s.charAt(left));
                left++;
            }

            set.add((int) s.charAt(right));
            maxlength = Math.max(maxlength,right-left+1);

            right++;
        }
    return maxlength;
    }
}