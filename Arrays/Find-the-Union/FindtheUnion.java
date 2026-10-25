import java.util.ArrayList;
import java.util.List;

/**
 * Union of two sorted arrays, with duplicates removed.
 * Time: O(n + m), Space: O(n + m) for the result.
 */
class Solution {
    public List<Integer> findUnion(int[] a, int[] b) {
        List<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            int value;
            if (a[i] <= b[j]) {
                value = a[i++];
            } else {
                value = b[j++];
            }

            if (union.isEmpty() || union.get(union.size() - 1) != value) {
                union.add(value);
            }
        }

        while (i < a.length) {
            int value = a[i++];
            if (union.isEmpty() || union.get(union.size() - 1) != value) {
                union.add(value);
            }
        }

        while (j < b.length) {
            int value = b[j++];
            if (union.isEmpty() || union.get(union.size() - 1) != value) {
                union.add(value);
            }
        }

        return union;
    }
}
