# STEP Semester 3 - Week 10: Data Structures & Algorithms

## Date: 13-09-2026

**Branch:** `feature/session_10`
**Package:** `data_structures_algorithms/`
**Problems:** 15 (10 practice + 5 assignment)

---

## Practice Problems (class_problems/ — 10 Files)

| # | Class | Task | Sample Input | Expected Output |
|---|-------|------|--------------|-----------------|
| 1 | VowelConsonantCounter | Count vowels and consonants | Programming | Vowels: 3, Consonants: 8 |
| 2 | WordReversalPalindromeChecker | Reverse with StringBuilder, check palindrome | level, java | level - palindrome, avaj - not a palindrome |
| 3 | EvenOddCounter | Count even and odd numbers | [3, 8, 12, 5, 7, 10] | Even: 3, Odd: 3 |
| 4 | InPlaceArrayReversal | Reverse array in place (two pointers) | [11, 22, 33, 44] | [44, 33, 22, 11] |
| 5 | DigitSumAndReversal | Digit sum and reversed number | 4721 | Sum of digits: 14, Reverse: 1274 |
| 6 | PrimeNumberChecker | Check primality up to √n | 29, 21 | 29 is prime, 21 is not prime |
| 7 | FactorialCalculation | Factorial with loop (0! = 1) | 5, 0 | 120, 1 |
| 8 | StudentGradeAssignment | Grade from marks (if-else ladder) | 72, 95, 35 | C, A, F |
| 9 | LeapYearDetector | Leap year rules with logical operators | 2024, 1900, 2000 | Leap, Not leap, Leap |
| 10 | StudentResultCard | Student class, average, grade | Asha [80,90,70], Ravi [60,55,50] | ASHA: Average 80.0, Grade B / RAVI: Average 55.0, Grade D |

---

## Assignment Problems (assignment_problems/ — 5 Files)

| # | Class | Task | Sample | Expected Output |
|---|-------|------|--------|-----------------|
| 1 | ExamScoreBandCounter | Count scores in [low, high] using binary search | band 42–58 / 90–100 | 6 / 0 |
| 2 | ClassAttendanceTracker | Present days and longest streak (single pass) | [1,1,0,1,1,1,0,1] | Present: 6, Longest streak: 3 |
| 3 | SecondBestScore | Second-highest distinct score, no sorting | [45,78,92,78,60] | 78 (and -1 for [50,50,50]) |
| 4 | DutyRosterRotation | Rotate right by k using (i + k) % n | [A..E], k=2 and k=7 | [D, E, A, B, C] both |
| 5 | BusiestBusRow | Row with largest total, smaller index on tie | 3×3 grid | Row 1, Total 7 |

---

## Complexity

| Problem | Time | Space |
|---------|------|-------|
| VowelConsonantCounter | O(n) | O(1) |
| WordReversalPalindromeChecker | O(n) | O(n) |
| EvenOddCounter | O(n) | O(1) |
| InPlaceArrayReversal | O(n) | O(1) |
| DigitSumAndReversal | O(log n) | O(1) |
| PrimeNumberChecker | O(√n) | O(1) |
| FactorialCalculation | O(n) | O(1) |
| StudentGradeAssignment | O(1) | O(1) |
| LeapYearDetector | O(1) | O(1) |
| StudentResultCard | O(m) per student (m = marks) | O(1) |
| ExamScoreBandCounter | O(log n) vs O(n) linear scan | O(1) |
| ClassAttendanceTracker | O(n) | O(1) |
| SecondBestScore | O(n) (no sorting, vs O(n log n)) | O(1) |
| DutyRosterRotation | O(n) (vs O(n·k) one-step rotation) | O(n) |
| BusiestBusRow | O(r × c) | O(1) |

---

## How to Compile & Run

```bash
cd src/main/java
javac -d out data_structures_algorithms/class_problems/*.java data_structures_algorithms/assignment_problems/*.java
java -cp out data_structures_algorithms.class_problems.PrimeNumberChecker
java -cp out data_structures_algorithms.assignment_problems.ExamScoreBandCounter
```

---

## Verification

All 15 programs were compiled with JDK 17 and run; output matches the sample output in each problem statement.

## Issues Faced

- None

**Status:** ✅ COMPLETE
