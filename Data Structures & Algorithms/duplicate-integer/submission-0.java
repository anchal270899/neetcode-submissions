class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> presentNums = new HashSet<Integer>();
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            if (presentNums.contains(nums[i])) {
                result = true;
                break;
            } else {
                presentNums.add(nums[i]);
            }
        }
        return result;
    }
}