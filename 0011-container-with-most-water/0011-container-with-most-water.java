class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left=0,right=n-1;
        int area_max = 0;
        int current_area;
        while(left<right){
            int width = right - left;   
            current_area = (width * (Math.min(height[left],height[right])));
            area_max = Math.max(area_max,current_area);
            if(height[left]>height[right]){
                right--;
            }
            else if(height[left]<height[right]){
                left++;
            }
            else{
                left++;
            }
        }
    return area_max;
    }
}