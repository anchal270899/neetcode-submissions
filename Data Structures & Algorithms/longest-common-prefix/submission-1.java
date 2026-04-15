class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        StringBuilder result = new StringBuilder();
        int idx = 0;
        boolean isLastChar = false;
        while (!isLastChar) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (idx >= strs[i].length() || idx >= strs[i+1].length() || strs[i].charAt(idx) != strs[i+1].charAt(idx)) {
                    return result.toString();
                }
                if (i == strs.length - 2) {
                    result.append(strs[i].charAt(idx));
                    idx++;

                }
            }
        }
        
        return result.toString();
    }
}