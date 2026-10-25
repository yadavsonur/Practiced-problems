/**
 * Maximum number of consecutive 1s in a binary array.
 * Time: O(n), Space: O(1).
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current = 0;
        int best = 0;

        for (int value : nums) {
            if (value == 1) {
                current++;
                best = Math.max(best, current);
            } else {
                current = 0;
            }
        }

        return best;
    }
}
