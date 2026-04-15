class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        TreeSet<Integer> numbersPresent = new TreeSet<Integer>();
        for (int num: nums) {
            countMap.put(num, countMap.containsKey(num) ? countMap.get(num) + 1: 1);
            numbersPresent.add(num);
        }
        int start = 0;
        for (Integer num: numbersPresent) {
            int count = countMap.get(num);
            int end = start + count;
            for (int i = start; i < end; i++) {
                nums[i] = num;
            }
            start += count;
        }
    }
}