class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length==0){
            return new int[0][0];
        }
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);
        for(int i=1;i<n;i++){
            int[] current = intervals[i];
            int[] last_of_merged = merged.get(merged.size()-1);
            if(current[0]<=last_of_merged[1]){
                last_of_merged[1] = Math.max(last_of_merged[1],current[1]);
            }
            else{
                merged.add(current);
            }
        }
    return merged.toArray(new int[merged.size()][]);
    }
}