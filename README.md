# STEP Semester 3 - Week 4: Array Algorithms

**Branch:** `feature/session_4`
**Package:** `arrays_advanced/`
**Problems:** 10 (5 practice + 5 assignment)

## Practice Problems (class_problems/)

| # | Class | Approach | Time |
|---|-------|----------|------|
| 1 | TwoSum | Nested loops | O(n²) |
| 2 | BestTimeToTrade | Single pass, min tracking | O(n) |
| 3 | ContainsDuplicate | Nested loops, early exit | O(n²) |
| 4 | MergeSortedArrays | Two pointers | O(n + m) |
| 5 | RotateArray | Modulo index arithmetic | O(n) |

## Assignment Problems (assignment_problems/)

| # | Class | Approach | Time |
|---|-------|----------|------|
| 1 | ProductExceptSelf | Prefix and suffix products | O(n) |
| 2 | MaximumSubarray | Kadane's algorithm | O(n) |
| 3 | ThreeSum | Sort + two pointers | O(n²) |
| 4 | SubarraySumEqualsK | HashMap of prefix sums | O(n) |
| 5 | FindMinInRotatedArray | Binary search | O(log n) |

## How to Compile & Run

```bash
cd src/main/java
javac -encoding UTF-8 -d out arrays_advanced/*/*.java
java -cp out arrays_advanced.class_problems.TwoSum
```

## Status

✅ All 10 problems implemented. Compiles with JDK 17. Output not re-checked against the assignment PDFs in this session.
