package offer.question65;

public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix == null || matrix.length == 0 || rows < 1 || cols < 1 || rows * cols != matrix.length || str == null || str.length == 0) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                boolean[][] visited = new boolean[rows][cols];
                if (hasPath(matrix, rows, cols, i, j, str, 0, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean hasPath(char[] matrix, int rows, int cols, int i, int j, char[] str, int strIndex, boolean[][] visited) {
        int mIndex = i * cols + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols || visited[i][j] || matrix[mIndex] != str[strIndex]) {
            return false;
        }

        visited[i][j] = true;
        if (strIndex == str.length - 1) {
            return true;
        }

        return hasPath(matrix, rows, cols, i + 1, j, str, strIndex + 1, visited) ||
                hasPath(matrix, rows, cols, i - 1, j, str, strIndex + 1, visited) ||
                hasPath(matrix, rows, cols, i, j + 1, str, strIndex + 1, visited) ||
                hasPath(matrix, rows, cols, i, j - 1, str, strIndex + 1, visited);
    }
}
