class Solution {
    public int maxArea(int[] heights) {
        int result =Integer.MIN_VALUE;
        int l = 0;
        int r = heights.length-1;
        while(l<r){
            int square = Math.min(heights[l],heights[r]) * (r-l);
            result = Math.max(result,square);
            
            if(heights[l]>heights[r]){
                r--;
            }else{
                l++;
            }

        }
        return result;
    }
}
