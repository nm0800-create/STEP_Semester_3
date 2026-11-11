package sorting_searching.class_problems;

import java.util.HashMap;

public class EmployeeIdLookup {
    // Build once: O(n) time, O(n) space
    static HashMap<String, String> buildLookup(String[][] records) {
        HashMap<String, String> map = new HashMap<>();
        for (String[] r : records) map.put(r[0], r[1]);
        return map;
    }

    // Each query: O(1) average time
    static String getDepartment(HashMap<String, String> lookup, String employeeId) {
        return lookup.getOrDefault(employeeId, "Unknown");
    }

    public static void main(String[] args) {
        String[][] records = {
            {"E245", "Finance"}, {"E110", "Engineering"},
            {"E390", "Marketing"}, {"E101", "Engineering"}
        };
        HashMap<String, String> lookup = buildLookup(records);
        System.out.println(getDepartment(lookup, "E390")); // Marketing
        System.out.println(getDepartment(lookup, "E999")); // Unknown
        System.out.println(getDepartment(lookup, "E245")); // own test: Finance
    }
}
