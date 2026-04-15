class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complementaryIdx = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (complementaryIdx.containsKey(comp)) {
                return new int[]{complementaryIdx.get(comp), i};
            } else {
                complementaryIdx.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
