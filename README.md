# STEP Semester 3 - Week 10: Data Structures & Algorithms

**Branch:** `feature/session_10`
**Package:** `data_structures_algorithms/`
**Problems:** 15 (10 practice + 5 assignment)

## Practice Problems (class_problems/)

| # | Class | Topic |
|---|-------|-------|
| 1 | VowelConsonantCounter | Character classification |
| 2 | WordReversalPalindromeChecker | StringBuilder reversal |
| 3 | EvenOddCounter | Counting by condition |
| 4 | InPlaceArrayReversal | Two pointers |
| 5 | DigitSumAndReversal | Digit arithmetic |
| 6 | PrimeNumberChecker | Primality up to √n |
| 7 | FactorialCalculation | Loops, overflow awareness |
| 8 | StudentGradeAssignment | Grade ladder |
| 9 | LeapYearDetector | Logical operators |
| 10 | StudentResultCard | Class with average and grade |

## Assignment Problems (assignment_problems/)

| # | Class | Topic |
|---|-------|-------|
| 1 | ExamScoreBandCounter | Binary search for band edges |
| 2 | ClassAttendanceTracker | Single-pass streak count |
| 3 | SecondBestScore | Second distinct maximum, no sort |
| 4 | DutyRosterRotation | Rotation with (i + k) % n |
| 5 | BusiestBusRow | 2D row totals |

Details, expected outputs and complexities: `src/main/java/data_structures_algorithms/README.md`.

## How to Compile & Run

```bash
cd src/main/java
javac -encoding UTF-8 -d out data_structures_algorithms/*/*.java
java -cp out data_structures_algorithms.class_problems.PrimeNumberChecker
```

## Status

✅ All 15 problems implemented. Compiled with JDK 17 and verified against the sample outputs.
