/**
 * One value appears once; every other value appears exactly twice.
 * Time: O(n), Space: O(1).
 */
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int value : nums) {
            result ^= value;
        }
        return result;
    }
}
