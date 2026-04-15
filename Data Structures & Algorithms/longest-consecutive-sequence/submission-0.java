class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numsPresent = new HashSet<>();
        for (int num : nums) {
            numsPresent.add(num);
        }

        int longest = 0;
        for (int num: numsPresent) {
            if (!numsPresent.contains(num - 1)) {
                int length = 1;
                while (numsPresent.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
