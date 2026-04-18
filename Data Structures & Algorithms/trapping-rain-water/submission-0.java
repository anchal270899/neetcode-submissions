// 3:15 - 3:21 - 
class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int[] leftBorder = new int[size];
        int[] rightBorder = new int[size];
        leftBorder[0] = height[0];
        rightBorder[size-1] = height[size-1];
        for (int i = 1; i < size; i++) {
            leftBorder[i] = Math.max(leftBorder[i-1], height[i]);
        }
        for (int i = size-2; i > 0; i--) {
            rightBorder[i] = Math.max(rightBorder[i+1], height[i]);
        }
        int totalWaterStored = 0;
        for (int i = 0; i < size; i++) {
            int currWater = Math.min(leftBorder[i], rightBorder[i]) - height[i];
            totalWaterStored += (currWater > 0 ? currWater : 0);
        }

        return totalWaterStored;
    }
}
