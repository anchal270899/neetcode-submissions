class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length -1;
        int maxVolume = 0;
        while (i < j) {
            int vol = (j - i) * Math.min(heights[i], heights[j]);
            maxVolume = Math.max(vol, maxVolume);
            if (heights[i] <= heights[j]) {
                    i++;
            } else {
                    j--;
            }
        }
        return maxVolume;
    }
}
