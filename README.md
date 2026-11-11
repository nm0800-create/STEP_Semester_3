# STEP Semester 3 - Week 2: Strings

**Branch:** `feature/session_2`
**Package:** `strings/`
**Problems:** 10 (5 practice + 5 assignment)

## Practice Problems (class_problems/)

| # | Class | Topic |
|---|-------|-------|
| 1 | VowelConsonantCounter | Character classification |
| 2 | CSVStudentRecordParser | Parsing delimited records |
| 3 | FileExtensionValidator | Validation with string methods |
| 4 | MaskedPhoneNumberFormatter | Formatting, masking |
| 5 | BankTransactionReferenceValidator | Pattern checks |

## Assignment Problems (assignment_problems/)

| # | Class | Topic |
|---|-------|-------|
| 1 | ATMPINValidator | Validation rules |
| 2 | WordReversalEncoder | Reversal and encoding |
| 3 | ProductInventoryParser | Parsing and aggregation |
| 4 | LibraryISBNNormalizer | Normalising identifiers |
| 5 | StopWordFilteredFrequencyReport | Word frequency |

## How to Compile & Run

```bash
cd src/main/java
javac -encoding UTF-8 -d out strings/*/*.java
java -cp out strings.class_problems.VowelConsonantCounter
```

## Status

✅ All 10 problems implemented. Compiles with JDK 17. Output not re-checked against the assignment PDFs in this session.
