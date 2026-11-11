package sorting_searching.class_problems;

import java.util.HashSet;

public class TransactionDuplicateCheck {
    // Chosen: HashSet. O(n) average time, O(n) extra space.
    static boolean hasDuplicate(String[] ids) {
        HashSet<String> seen = new HashSet<>();
        for (String id : ids) {
            if (!seen.add(id)) return true;
        }
        return false;
    }

    // Alternative: nested loops. O(n^2) time, O(1) extra space.
    static boolean hasDuplicateNested(String[] ids) {
        for (int i = 0; i < ids.length; i++)
            for (int j = i + 1; j < ids.length; j++)
                if (ids[i].equals(ids[j])) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasDuplicate(new String[]{"TXN1001", "TXN1002", "TXN1003", "TXN1002", "TXN1004"})); // true
        System.out.println(hasDuplicate(new String[]{"TXN2001", "TXN2002", "TXN2003"}));                      // false
        System.out.println(hasDuplicateNested(new String[]{"A", "B", "A"}));                                  // own test: true
    }
}
