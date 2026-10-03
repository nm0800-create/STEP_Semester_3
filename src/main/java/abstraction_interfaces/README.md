# STEP Semester 3 - Week 9: Abstraction & Interfaces

## Date: 13-09-2026

### Week 9 Assignment: 10 Problems Solved ✅

**Branch:** `feature/session_9`  
**Package:** `abstraction_interfaces/`  
**Focus:** Abstract classes, interfaces, optional capabilities, shared behavior

---

## Practice Problems (class_problems/ — 5 Files)

### 1. GardenPlotReport
- **Classes:** CirclePlot, RectanglePlot, TrianglePlot (extend Plot)
- **Concept:** Abstract class defines area calculation
- **Formulas:** Circle (π×r²), Rectangle (l×w), Triangle (0.5×b×h)
- **Output:** Owner: area for each plot, then total area

### 2. WeeklyStaffPay
- **Classes:** FullTimeStaff, HourlyStaff, Intern (extend StaffMember)
- **Concept:** Abstract base defines common pay interface
- **Rules:** Fixed salary / hourly with overtime (1.5× after 40hrs) / fixed stipend
- **Output:** Name: pay for each person, then total payroll

### 3. LibraryLateFineCounter
- **Classes:** Book, DVD, Magazine (extend LibraryItem)
- **Concept:** Each item type has different fine rule
- **Rules:** Books (₹2/day), DVDs (₹5/day max ₹50), Magazines (₹1/day)
- **Output:** Title: fine for each item, then total fines

### 4. ElectricityBilling
- **Classes:** HomeConnection, ShopConnection, FactoryConnection (extend Connection)
- **Concept:** Progressive rates and minimum charges via inheritance
- **Rules:** Home (₹5 ≤100 units, ₹7 after) / Shop (₹8+₹100) / Factory (₹6 min ₹1000)
- **Output:** Bill amount for each, then total billed

### 5. TravelBooking
- **Classes:** Bus, Train, Flight (extend TravelMode)
- **Concept:** Shared booking fee via static constant (written once)
- **Rules:** Bus (₹2/km), Train (₹1.5/km), Flight (₹2500+₹4/km) + ₹50 fee
- **Output:** Total fare (includes fee) for each booking

---

## Assignment Problems (assignment_problems/ — 5 Files)

### 6. MovieTicketCounter
- **Classes:** RegularTicket, PremiumTicket, RecinerTicket (extend Ticket)
- **Concept:** Shared convenience fee via abstract class (written once)
- **Rules:** Regular (₹150), Premium (₹250), Recliner (₹400) + ₹20 convenience fee
- **Output:** Total amount for each booking, then grand total

### 7. ParcelShippingDesk
- **Classes:** StandardParcel, ExpressParcel, FragileParcel
- **Interface:** Insurable (for ExpressParcel & FragileParcel only)
- **Concept:** Optional insurance via interface
- **Rules:** Different charges, insurance (2% of value) for some types only
- **Output:** Charge, Insurance, Total for each, then grand total

### 8. CollegeFeeCounter
- **Classes:** DayScholar, Hosteller, ScholarStudent (extend Student)
- **Interface:** BusUser (for DayScholar & ScholarStudent only)
- **Concept:** Optional bus fee via interface capability check
- **Rules:** Tuition + optional bus (₹12k) + optional hostel (₹60k)
- **Output:** Name: fee for each student, then total collected

### 9. CityCabFareMeter
- **Classes:** Mini, Sedan, SUV (extend Cab)
- **Interface:** NightServiceCapable (for Sedan & SUV only)
- **Concept:** Capability check prevents unsupported operations
- **Rules:** Min ₹100, night = 20% surcharge (Sedan/SUV only), Mini rejects night
- **Output:** Fare for completed trips, rejection message for unavailable service

### 10. HomeApplianceEnergyReport
- **Classes:** Fridge, AC, TV, Washer (extend Appliance)
- **Interface:** SaverMode (for AC & Washer only)
- **Concept:** Optional saver mode reduces energy by 25%
- **Rules:** Power × hours ÷ 1000 = units, units × ₹8 = cost (with saver reduction)
- **Output:** Units and cost for each, rejection message if unsupported saver mode

---

## Key Concepts Covered

✅ **Abstract Classes**
- Define common interface for all subclasses
- Force subclasses to implement abstract methods
- Can have concrete methods and constructors
- Cannot be instantiated directly

✅ **Interfaces**
- Define optional capabilities without instance state
- Avoid diamond problem (vs multiple class inheritance)
- Enable capability-based design
- Use `instanceof` to check if available

✅ **Abstraction**
- Hide implementation details
- Show only what's needed (public interface)
- Separate contract from implementation

✅ **Design Patterns**
- Template Method (abstract class defines structure)
- Strategy (interface defines behavior choice)
- Capability Pattern (optional features via interface)

✅ **SOLID Principles**
- Single Responsibility: Each class handles one concern
- Open/Closed: Open for extension (new classes), closed for modification
- Liskov Substitution: Subclasses can replace base classes
- Interface Segregation: Small, focused interfaces
- Dependency Inversion: Depend on abstractions, not concrete types

---

## Time Complexities

All problems: **O(n)** where n is the number of items/bookings

---

## How to Compile & Run

```bash
# Navigate to Week 9 package
cd src/main/java/abstraction_interfaces

# Compile practice problems
javac class_problems/GardenPlotReport.java
java -cp ../../.. abstraction_interfaces.class_problems.GardenPlotReport

# Compile assignment problems
javac assignment_problems/MovieTicketCounter.java
java -cp ../../.. abstraction_interfaces.assignment_problems.MovieTicketCounter
```

---

## Testing Notes

✅ All problems include test cases in main()  
✅ No type-checking if-else blocks  
✅ Pure polymorphism via inheritance/interfaces  
✅ Capability checks via `instanceof`  
✅ Output matches expected format exactly  

---

## Issues Faced

- None

---

**Status:** ✅ COMPLETE & READY FOR SUBMISSION

---

**Week 9 - Abstraction & Interfaces — FINISHED**
