// class Solution {
//     public int removeElement(int[] nums, int val) {
//         if (nums.length == 0) {
//             return 0;
//         }
//         if (nums.length == 1) {
//             if (nums[0] == val) {
//                 return 0;
//             }
//         }
//         int start = 0;
//         int end = nums.length - 1;
//         while (start < end) {
//             if (nums[end] == val) end--;
//             if (nums[start] == val) {
//                 nums[start] = nums[end];
//                 end--;
//             }
//             start++;
//         }
//         return start + 1;
//     }
// }

class Solution {
    public int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length; 

        while (start < end) {
            if (nums[start] == val) {
                // Overwrite with the last element and shrink the search window
                nums[start] = nums[end - 1];
                end--; 
                // Notice we DO NOT increment start here. 
                // We need to re-check the newly swapped element in the next loop.
            } else {
                // Only move forward if the current element is safe
                start++;
            }
        }
        
        return end; // 'end' represents the new length of the array
    }
}