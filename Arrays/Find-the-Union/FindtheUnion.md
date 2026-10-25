# Find the Union of Two Sorted Arrays

## Recognition trigger
Both arrays are **sorted** and the union must contain each distinct value once.

## Core idea
Use two pointers to merge the arrays in sorted order, appending a value only when it differs from the last result value.

## Steps
1. Compare `a[i]` and `b[j]`; consume the smaller value (consume from `a` on equality).
2. Append it only if the result is empty or its last value differs.
3. Process either remaining suffix the same way.

## Complexity
- **Time:** (O(n+m)).
- **Extra space:** (O(n+m)) for the returned list.

## Pitfalls
- Skipping duplicates must apply to both arrays and their remaining suffixes.
- This implementation assumes both inputs are sorted in ascending order.
- If the platform requires `ArrayList<Integer>` as the exact return type, change the declared return type accordingly.

## Pattern / invariant
The result remains sorted and duplicate-free after every append.
