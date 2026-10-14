package data_structures_algorithms.assignment_problems;

import java.util.Arrays;

public class DutyRosterRotation {
    static String[] rotateRoster(String[] names, int k) {
        int n = names.length;
        k = k % n;  // Normalize k
        
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = names[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        String[] names1 = {"A", "B", "C", "D", "E"};
        System.out.println(Arrays.toString(rotateRoster(names1, 2)));  // [D, E, A, B, C]
        System.out.println(Arrays.toString(rotateRoster(names1, 7)));  // [D, E, A, B, C]
    }
}
