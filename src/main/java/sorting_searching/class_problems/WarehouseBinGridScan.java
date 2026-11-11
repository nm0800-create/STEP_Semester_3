package sorting_searching.class_problems;

public class WarehouseBinGridScan {
    static class Summary {
        final long total;
        final int row, col;
        Summary(long total, int row, int col) { this.total = total; this.row = row; this.col = col; }
    }

    // O(m * n) time, O(1) additional space
    static Summary warehouseSummary(int[][] grid) {
        long total = 0;
        int maxVal = -1, maxRow = 0, maxCol = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                total += grid[i][j];
                if (grid[i][j] > maxVal) {   // strict > keeps the first maximum
                    maxVal = grid[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        return new Summary(total, maxRow, maxCol);
    }

    public static void main(String[] args) {
        int[][] grid = {{4, 9, 2}, {7, 1, 6}, {3, 12, 5}};
        Summary s = warehouseSummary(grid);
        System.out.println("total = " + s.total + ", maxCoordinate = (" + s.row + ", " + s.col + ")"); // 49, (2, 1)
        Summary t = warehouseSummary(new int[][]{{5, 5}, {1, 0}});
        System.out.println("total = " + t.total + ", maxCoordinate = (" + t.row + ", " + t.col + ")"); // tie -> (0, 0)
    }
}
