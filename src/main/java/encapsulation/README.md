# STEP Semester 3 - Week 7: Encapsulation & Access Control

**Branch:** `feature/session_7`
**Package:** `encapsulation/`
**Problems:** 10 (5 practice + 5 assignment)

---

## Practice Problems (class_problems/ — 5 Files)

| # | Class | Task | Sample | Expected Output |
|---|-------|------|--------|-----------------|
| 1 | PiggyBank | Private savings, deposit/withdraw only; reject over-withdrawal; final ID | deposit 100, withdraw 30, withdraw 500 | savings 100 → 70 → 70 (rejected) |
| 2 | Scorecard | Private results array, score only; reject extra answers | T, T, F, T | score 3 |
| 3 | NameTag | Immutable (final fields); nickname from full name | "Maria Gomez" | "Maria G." |
| 4 | Locker | Write-only code; change requires correct current code | "1234" → "5678" / wrong old code | success / rejected |
| 5 | AttendanceSheet | Private names; no duplicates; count and lookup only | Ana, Ben, Ana | count 2; Ben true; Chen false |

## Assignment Problems (assignment_problems/ — 5 Files)

| # | Class | Task | Sample | Expected Output |
|---|-------|------|--------|-----------------|
| 1 | GameCharacter | Health clamped to [0, max]; max is final | 100 max: −30, +50, −150 | 70, 100, 0 |
| 2 | Playlist | Returns a copy of the song array | add "Song A", "Song B" | [Song A, Song B], count 2 |
| 3 | PasswordChecker | Stores password privately; returns strength only | "abcd", 8 chars, 12 chars | Weak, Medium, Strong |
| 4 | TrafficLight | Color advances only via next(): RED → GREEN → YELLOW → RED | start, next ×3 | RED, GREEN, YELLOW, RED |
| 5 | Cart | Private prices; total and count computed on request | 250, 99, 151 | total 500, count 3 |

> The assignment's `Character` class is named `GameCharacter` here so it does not shadow `java.lang.Character`.

---

## Key Concepts

- **private fields** — state can only change through methods that check it
- **final fields** — fixed at creation (max health, ID, lockerNumber, name parts)
- **Defensive copy** — `Arrays.copyOf` returns a new array so callers can't edit internal state
- **No setters** — read-only access via getters only, or none at all for secrets (password, locker code, score list)
- **Validate before changing** — the check happens first; a rejected action leaves state unchanged

---

## Complexity

| Problem | Time | Space |
|---------|------|-------|
| GameCharacter / PiggyBank / Locker / TrafficLight | O(1) | O(1) |
| Playlist.getSongs (copy) | O(n) | O(n) |
| PasswordChecker | O(1) | O(1) |
| Scorecard.getScore | O(n) | O(1) |
| NameTag | O(1) per call | O(1) |
| AttendanceSheet.isPresent | O(n) | O(1) |
| Cart.getTotal | O(n) | O(1) |

---

## How to Compile & Run

```bash
cd src/main/java
javac -d out encapsulation/class_problems/*.java encapsulation/assignment_problems/*.java
java -cp out encapsulation.class_problems.PiggyBank
java -cp out encapsulation.assignment_problems.GameCharacter
```

---

## Verification

All 10 programs compiled with JDK 17 (`-Xlint:all`, no warnings) and run; output matches the sample output in each problem statement.

**Status:** ✅ COMPLETE
