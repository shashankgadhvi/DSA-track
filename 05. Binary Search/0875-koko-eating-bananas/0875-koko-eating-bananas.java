class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int low=1,high=0,mid;
      for(int pile : piles){
        high = Math.max(pile,high);
      }
      while(low<=high){
        long totalhrs = 0;
        mid = (low+high)/2;
        for(int pile : piles){
            totalhrs = totalhrs + (long) Math.ceil((double)pile/mid);
        }
        if(totalhrs<=h){ // shrink the range look below mid
            high = mid - 1;
        }
        else if(totalhrs>h){
            low = mid+1;
        }
      }
    return low;
    }
}