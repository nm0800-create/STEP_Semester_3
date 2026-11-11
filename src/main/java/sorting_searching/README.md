# STEP Semester 3 - Week 11: Sorting & Searching

**Branch:** `feature/session_11`
**Package:** `sorting_searching/`
**Problems:** 15 (10 practice + 5 assignment)

---

## Practice Problems (class_problems/ — 10 Files)

| # | Class | Task | Approach | Time | Space |
|---|-------|------|----------|------|-------|
| 1 | LibraryCatalogLookup | Find book by sorted ISBN | Binary search | O(log n) | O(1) |
| 2 | WarehouseBinGridScan | Total items + first max bin | Single scan, strict `>` | O(m·n) | O(1) |
| 3 | TransactionDuplicateCheck | Any repeated transaction ID | HashSet (chosen); nested loops (alternative) | O(n) avg / O(n²) | O(n) / O(1) |
| 4 | EmployeeIdLookup | Department by ID, many queries | HashMap built once | build O(n), query O(1) avg | O(n) |
| 5 | PairWithTargetSum | Two distinct elements sum to target | HashSet (chosen); brute force | O(n) / O(n²) | O(n) / O(1) |
| 6 | BestSingleTradeProfit | Max buy-then-sell profit | Single pass tracking minimum | O(n) | O(1) |
| 7 | SearchInsertPosition | Index of target or insert position | Lower-bound binary search | O(log n) | O(1) |
| 8 | SpiralOrderTraversal | Grid elements in spiral order | Four boundary pointers | O(m·n) | O(m·n) output |
| 9 | PairSumSorted | Pair summing to target in sorted array | Two pointers (brute force is O(n²)) | O(n) | O(1) |
| 10 | RemoveDuplicatesSorted | Remove consecutive duplicates in place | Write pointer | O(n) | O(1) |

Sample outputs verified: Classic Mythology / Not Found; total 49 at (2, 1); true / false; Marketing / Unknown; 5 / 0; 2 / 1 / 4 (inserts at 4 for own test); [1, 2, 3, 6, 9, 8, 7, 4, 5]; (-1, 5) / Not Found; length 5.

---

## Assignment Problems (assignment_problems/ — 5 Files)

| # | Class | Task | Method | Sample Output |
|---|-------|------|--------|---------------|
| 1 | HeightLineUp | Bubble sort with early exit, print every sweep | `lineUp` | sample 2: Pass 1 [1,2,3,4], Pass 2 [1,2,3,4] |
| 2 | PrizeTable | Selection sort descending, count real swaps | `prizeTable` | [90,75,60,45] swaps 2; [80,70,60] swaps 0 |
| 3 | LibraryBookShelf | Insertion sort, print after each placement | `shelf` | [10,30,40,20], [10,30,40,20], [10,20,30,40] |
| 4 | QueueInOrder | Index of first token smaller than previous | `firstBreak` | 4 and -1 |
| 5 | DiceSort | Counting sort on values 1–6, print counts | `diceSort` | Counts: 1:2 2:1 3:0 4:3 5:0 6:1; [1,1,2,4,4,4,6] |

All assignment problems use hand-written sorting; `Arrays.sort` is not called anywhere.

### Known discrepancy in the HeightLineUp sample
The spec says that when a sweep makes no swap, print that sweep and stop. For sample 1, `[4, 2, 5, 1]`, the array becomes sorted at the end of pass 3, so the first no-swap sweep is pass 4. The program prints pass 4 as required by that rule. The printed sample only shows passes 1–3, so the expected output in the PDF does not match its own rule. Sample 2 does match the rule. Please confirm with the instructor which behavior is wanted.

---

## Complexity Summary

- Sorting-based assignment problems: bubble sort O(n²) worst case, selection sort O(n²), insertion sort O(n²) worst case, counting sort O(n + k) with k = 6.
- Searching: binary search O(log n), hash-based lookup O(1) average, linear scan O(n).

---

## How to Compile & Run

```bash
cd src/main/java
javac -d out sorting_searching/class_problems/*.java sorting_searching/assignment_problems/*.java
java -cp out sorting_searching.class_problems.LibraryCatalogLookup
java -cp out sorting_searching.assignment_problems.DiceSort
```

---

## Verification

All 15 programs compiled with JDK 17 (`-Xlint:all`, no warnings) and run. Each includes an extra test case of its own beyond the sample input.

**Status:** ✅ COMPLETE (with the HeightLineUp sample discrepancy noted above)
