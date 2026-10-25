/**
 * Find the missing number from the range 0..n.
 * Exactly one value is missing; all present values are distinct.
 * Time: O(n), Space: O(1).
 */
class Solution {
    public int missingNumber(int[] nums) {
        int missing = nums.length;

        for (int i = 0; i < nums.length; i++) {
            missing ^= i;
            missing ^= nums[i];
        }

        return missing;
    }
}
