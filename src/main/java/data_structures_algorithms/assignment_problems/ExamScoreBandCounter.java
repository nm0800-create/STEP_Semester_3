package data_structures_algorithms.assignment_problems;

public class ExamScoreBandCounter {
    static int countInBand(int[] scores, int low, int high) {
        // Find first position with score >= low
        int firstPos = binarySearchLeft(scores, low);
        if (firstPos == -1) return 0;
        
        // Find first position with score > high
        int lastPos = binarySearchRight(scores, high);
        
        return lastPos - firstPos + 1;
    }
    
    static int binarySearchLeft(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
    
    static int binarySearchRight(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] scores = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        System.out.println(countInBand(scores, 42, 58));  // 6
        System.out.println(countInBand(scores, 90, 100)); // 0
    }
}
