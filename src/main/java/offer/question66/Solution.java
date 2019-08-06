package offer.question66;

public class Solution {
    public int movingCount(int threshold, int rows, int cols) {
        if (threshold < 0 || rows < 1 || cols < 1) {
            return 0;
        }

        boolean[][] visited = new boolean[rows][cols];
        return movingCount(threshold, rows, cols, 0, 0, visited);

    }

    private int movingCount(int threshold, int rows, int cols, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || visited[i][j] || biggerThanThreshold(i, j, threshold)) {
            return 0;
        }

        visited[i][j] = true;
        return 1 + movingCount(threshold, rows, cols, i - 1, j, visited)
                + movingCount(threshold, rows, cols, i + 1, j, visited)
                + movingCount(threshold, rows, cols, i, j - 1, visited)
                + movingCount(threshold, rows, cols, i, j + 1, visited);
    }

    private boolean biggerThanThreshold(int i, int j, int threshold) {
        int sum = 0;
        while (i != 0 || j != 0) {
            sum = sum + (i % 10) + (j % 10);
            i = i / 10;
            j = j / 10;
        }

        return sum > threshold;
    }
}
