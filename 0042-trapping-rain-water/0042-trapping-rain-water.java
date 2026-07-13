class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftmax=0;
        int rightmax=0;
        int start=0;
        int end=n-1;
        int result=0;

        while(start<end){
            if(height[start]<height[end]){
                leftmax = Math.max(leftmax,height[start]);
                result = result + (leftmax - height[start]);
                start++;
            }
            else{
                rightmax = Math.max(height[end],rightmax);
                result = result + (rightmax-height[end]);
                end--;
            }
        }
        return result;
    }
}