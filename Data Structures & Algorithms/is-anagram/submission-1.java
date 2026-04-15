class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> firstCharCount = computeCharCount(s);
        HashMap<Character, Integer> secondCharCount = computeCharCount(t);
        if (firstCharCount.size() != secondCharCount.size()) {
            return false;
        }
        for (Character ch: firstCharCount.keySet()) {
            if (!firstCharCount.get(ch).equals(secondCharCount.get(ch))) {
                return false;
            }
        }
        return true;
    }

    public HashMap<Character, Integer> computeCharCount(String s) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        for (char ch: s.toCharArray()) {
                if (charCount.containsKey(ch)) {
                    charCount.put(ch, charCount.get(ch) + 1);
                } else {
                    charCount.put(ch, 1);
                }
        }
        return charCount;
    }
}
