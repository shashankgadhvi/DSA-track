class Solution {
    public int[][] merge(int[][] intervals) {

        int n = intervals.length;

        if(intervals == null || n==0){
            return new int[0][0]; 
        }
        
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> merged = new ArrayList<>();

        merged.add(intervals[0]);

        for(int i=1;i<n;i++){
            int[] current = intervals[i];

            int[] mergedlast = merged.get(merged.size() - 1);

            if(current[0]<=mergedlast[1]){
                mergedlast[1] = Math.max(mergedlast[1],current[1]);
            }
            else{
                merged.add(current);
            }
        }
    return merged.toArray(new int[merged.size()][]);
    }
}