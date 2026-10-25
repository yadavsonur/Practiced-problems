# Number Appearing Once

## Recognition trigger
Every value appears exactly twice except one value that appears once.

## Core idea
XOR all values. Each pair cancels because x XOR x = 0, and XOR with zero preserves the remaining value.

## Steps
1. Initialize result to 0.
2. XOR each array value into result.
3. Return result.

## Complexity
- **Time:** O(n).
- **Extra space:** O(1).

## Pitfalls
- All other values must occur exactly twice.
- XOR works for negative integers too.
- This does not solve the general case where duplicates may occur arbitrary numbers of times.

## Pattern / invariant
After processing any prefix, result equals the XOR of all values in that prefix.
