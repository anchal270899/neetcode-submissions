class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> stringMap = new HashMap<String, ArrayList<String>>();
        for (String str: strs) {
            int[] allCharCount = new int[26];
            for (int i = 0; i < allCharCount.length; i++) {
                allCharCount[i] = 0;
            }
            for (int j = 0; j < str.length(); j++) {
                int currIdx = (int) str.charAt(j) - (int)'a';
                allCharCount[currIdx]++;
            }
            String key = Arrays.toString(allCharCount);
            if (stringMap.containsKey(key)) {
                ArrayList<String> words = stringMap.get(key);
                words.add(str);
                stringMap.put(key, words);
            } else {
                ArrayList<String> words = new ArrayList<String>();
                words.add(str);
                stringMap.put(key, words);
            }
        }
        return new ArrayList<>(stringMap.values());
    }
}
