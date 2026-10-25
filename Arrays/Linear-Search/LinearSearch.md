# Linear Search

## Recognition trigger
Use when the array is **unsorted** or no faster search structure is available.

## Core idea
Inspect elements from left to right and stop at the first match.

## Steps
1. Iterate through every index.
2. If `arr[i] == target`, return `i`.
3. If the loop finishes, return `-1`.

## Complexity
- **Time:** (O(n)) worst case; (O(1)) best case when the first element matches.
- **Extra space:** (O(1)).

## Pitfalls
- Return the index, not the value, when the problem asks for a position.
- Decide what “not found” should return; this implementation uses `-1`.
- Empty arrays naturally return `-1`.

## Pattern / invariant
After checking index `i`, every earlier index has already been ruled out.
