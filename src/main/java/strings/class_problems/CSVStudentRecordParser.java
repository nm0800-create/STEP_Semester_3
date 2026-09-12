package strings.class_problems;

public class CSVStudentRecordParser {
    
    public void parseStudentRecord(String csvLine) {
        String[] fields = csvLine.split(",");
        
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }
        
        String name = fields[0].trim();
        String rollNo = fields[1].trim();
        String dept = fields[2].trim();
        
        System.out.printf("Name: %s | Roll No: %s | Dept: %s%n", name, rollNo, dept);
    }
    
    public static void main(String[] args) {
        CSVStudentRecordParser parser = new CSVStudentRecordParser();
        
        System.out.println("=== CSV Student Record Parser ===\n");
        
        parser.parseStudentRecord("Ananya Verma,RA2211003010123,CSE");
        parser.parseStudentRecord("Ananya Verma,CSE");
        parser.parseStudentRecord("Ravi Kumar,RA2211004050456,ECE");
    }
}
