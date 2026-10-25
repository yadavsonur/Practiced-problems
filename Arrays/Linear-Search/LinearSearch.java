/**
 * Linear Search
 * Time: O(n), Space: O(1)
 */
class Solution {
    /**
     * Returns the index of target, or -1 if it is absent.
     */
    public int search(int[] arr, int target) {
        if (arr == null) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
