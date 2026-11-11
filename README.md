# STEP Semester 3 - Week 9: Abstraction & Interfaces

**Branch:** `feature/session_9`
**Package:** `abstraction_interfaces/`
**Problems:** 10 (5 practice + 5 assignment)

## Practice Problems (class_problems/)

| # | Class | Base type | Subclasses |
|---|-------|-----------|------------|
| 1 | GardenPlotReport | Plot | CIRCLE, RECTANGLE, TRIANGLE |
| 2 | WeeklyStaffPay | StaffMember | FULLTIME, HOURLY, INTERN |
| 3 | LibraryLateFineCounter | LibraryItem | BOOK, DVD, MAGAZINE |
| 4 | ElectricityBilling | Connection | HOME, SHOP, FACTORY |
| 5 | TravelBooking | TravelMode | BUS, TRAIN, FLIGHT (shared fee constant) |

## Assignment Problems (assignment_problems/)

| # | Class | Interface | Implemented by |
|---|-------|-----------|----------------|
| 1 | MovieTicketCounter | — (shared fee in abstract Ticket) | REGULAR, PREMIUM, RECLINER |
| 2 | ParcelShippingDesk | Insurable | EXPRESS, FRAGILE |
| 3 | CollegeFeeCounter | BusUser | DayScholar, ScholarStudent (Hosteller has no bus) |
| 4 | CityCabFareMeter | NightServiceCapable | SEDAN, SUV |
| 5 | HomeApplianceEnergyReport | SaverMode | AC, Washer |

## How to Compile & Run

```bash
cd src/main/java
javac -encoding UTF-8 -d out abstraction_interfaces/*/*.java
java -cp out abstraction_interfaces.class_problems.GardenPlotReport
```

## Verification

Compiled with JDK 17 and run. Output matches the spec sample for all 10 problems (labels and formats included).

**Status:** ✅ COMPLETE
