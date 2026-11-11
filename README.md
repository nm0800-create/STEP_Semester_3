# STEP Semester 3 - Week 11: Sorting & Searching

**Branch:** `feature/session_11`
**Package:** `sorting_searching/`
**Problems:** 15 (10 practice + 5 assignment)

## Practice Problems (class_problems/)

| # | Class | Topic |
|---|-------|-------|
| 1 | LibraryCatalogLookup | Binary search on sorted ISBNs |
| 2 | WarehouseBinGridScan | 2D scan, first maximum |
| 3 | TransactionDuplicateCheck | HashSet vs nested loops |
| 4 | EmployeeIdLookup | HashMap built once |
| 5 | PairWithTargetSum | Hash set vs brute force |
| 6 | BestSingleTradeProfit | Single-pass minimum tracking |
| 7 | SearchInsertPosition | Lower-bound binary search |
| 8 | SpiralOrderTraversal | Boundary pointers |
| 9 | PairSumSorted | Two pointers |
| 10 | RemoveDuplicatesSorted | In-place write pointer |

## Assignment Problems (assignment_problems/)

| # | Class | Sort / method |
|---|-------|---------------|
| 1 | HeightLineUp | Bubble sort with early exit |
| 2 | PrizeTable | Selection sort (descending), counts swaps |
| 3 | LibraryBookShelf | Insertion sort |
| 4 | QueueInOrder | Single-pass break detection |
| 5 | DiceSort | Counting sort |

Details, expected outputs and complexities: `src/main/java/sorting_searching/README.md`.

## How to Compile & Run

```bash
cd src/main/java
javac -encoding UTF-8 -d out sorting_searching/*/*.java
java -cp out sorting_searching.assignment_problems.DiceSort
```

## Status

✅ All 15 problems implemented. Compiled with JDK 17 and run.

**Open item:** HeightLineUp sample 1 shows 3 passes, but the written rule prints a 4th no-swap pass. See the package README.
