package data_structures_algorithms.assignment_problems;

public class BusiestBusRow {
    static int[] busiestRow(int[][] grid) {
        int maxRow = 0, maxTotal = 0;
        
        for (int i = 0; i < grid.length; i++) {
            int rowTotal = 0;
            for (int j = 0; j < grid[i].length; j++) {
                rowTotal += grid[i][j];
            }
            if (rowTotal > maxTotal) {
                maxTotal = rowTotal;
                maxRow = i;
            }
        }
        
        return new int[]{maxRow, maxTotal};
    }
    
    public static void main(String[] args) {
        int[][] grid = {{2, 0, 1}, {3, 3, 1}, {1, 1, 1}};
        int[] result = busiestRow(grid);
        System.out.println("Row " + result[0] + ", Total " + result[1]);  // Row 1, Total 7
    }
}
