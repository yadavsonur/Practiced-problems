# Find the Missing Number

## Recognition trigger
An array contains distinct values from the range (0) through (n), with exactly one value missing.

## Core idea
XOR all indices, all array values, and (n). Equal values cancel because (x \oplus x = 0); the unmatched value is missing.

## Steps
1. Initialize the answer to `nums.length` (the index (n)).
2. For each index `i`, XOR the answer with `i` and `nums[i]`.
3. Return the answer.

## Complexity
- **Time:** (O(n)).
- **Extra space:** (O(1)).

## Pitfalls
- This assumes exactly one missing value and no duplicates.
- The expected range is (0..n), not (1..n).
- XOR avoids potential integer overflow from summing a large range.

## Pattern / invariant
Every number appearing twice cancels under XOR; only the missing number remains.
