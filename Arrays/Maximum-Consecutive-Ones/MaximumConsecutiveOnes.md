# Maximum Consecutive Ones

## Recognition trigger
Find the longest contiguous run of a target value (here, `1`) in a single pass.

## Core idea
Track the current run and the longest run seen so far. Reset the current run when a non-`1` appears.

## Steps
1. Start `current = 0` and `best = 0`.
2. For each value, increment `current` if it is `1`; otherwise reset it to zero.
3. Update `best` whenever the current run grows.

## Complexity
- **Time:** (O(n)).
- **Extra space:** (O(1)).

## Pitfalls
- Update the maximum after increasing the current run.
- An empty array or an array with no ones returns zero.
- This version treats every value other than `1` as a separator.

## Pattern / invariant
`current` is the run length ending at the current position; `best` is the maximum run seen so far.
