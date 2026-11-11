# STEP Semester 3 - Week 8: Inheritance & Polymorphism

**Branch:** `feature/session_8`
**Package:** `inheritance_polymorphism/`
**Problems:** 10 (5 practice + 5 assignment)

## Practice Problems (class_problems/)

| # | Class | Base type | Subclasses |
|---|-------|-----------|------------|
| 1 | PaymentProcessor | Payment | CARD, WALLET, BANKTRANSFER |
| 2 | LibrarySystem | LibraryItem | BOOK, DVD, MAGAZINE |
| 3 | DeliverySystem | Delivery | STANDARD, EXPRESS, INTERNATIONAL |
| 4 | ExamGrader | Question | MCQ, TF, ESSAY |
| 5 | TransportFareCalculator | Transport | BUS, TRAIN, METRO |

## Assignment Problems (assignment_problems/)

| # | Class | Base type | Subclasses |
|---|-------|-----------|------------|
| 1 | CanteenBilling | Customer | STUDENT, STAFF, GUEST |
| 2 | ParkingCalculator | Vehicle | BIKE, CAR, TRUCK |
| 3 | HostelElectricity | Room | SINGLE, SHARED, AC |
| 4 | FestivalBonus | Employee | FullTime, PartTime, Intern |
| 5 | StreamingRenewal | SubscriptionPlan | Basic, Standard, Premium |

## How to Compile & Run

```bash
cd src/main/java
javac -encoding UTF-8 -d out inheritance_polymorphism/*/*.java
java -cp out inheritance_polymorphism.class_problems.PaymentProcessor
```

## Verification

Compiled with JDK 17 and run. Output matches the spec for every problem except one:

**Known discrepancy — DeliverySystem (practice problem 3).** The spec's sample gives EXPRESS = 29.00 and INTERNATIONAL = 155.00, but the stated rules give 24.00 (15 + 5×1.00 + 20×0.20) and 145.00 (25 + 20×2.00 + 100×0.50 + 30). The code follows the written rules. Please confirm the intended formula with the instructor.

**Status:** ✅ Implemented; one sample to confirm (see above)
