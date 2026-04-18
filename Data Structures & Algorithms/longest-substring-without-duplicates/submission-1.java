// 4:25 - 4:31 - 4:40
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> chars = new HashSet<>();
        int maxLen = s.length() == 0 ? 0 : 1;

        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            while (chars.contains(s.charAt(r))) {
                chars.remove(s.charAt(l));
                l++;
            }
            chars.add(s.charAt(r));
            maxLen = Math.max(maxLen, r-l + 1);
        }
        return maxLen;
    }
}
