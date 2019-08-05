package offer.question65;

public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix == null || matrix.length == 0 || rows < 1 || cols < 1 || matrix.length != cols * rows || str == null || str.length == 0 || str.length > matrix.length) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                boolean[][] visited = new boolean[rows][cols];
                if (hasPath(matrix, rows, cols, str, 0, 0, 0, visited)) {
                    return true;
                }
            }
        }

        return false;

    }

    private boolean hasPath(char[] matrix, int rows, int cols, char[] str, int index, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || visited[i][j]) {
            return false;
        }

        if (index == str.length) {
            return true;
        }
        int mIndex = i * cols + j;
        if (matrix[mIndex] != str[index]) {
            return false;
        }

        visited[i][j] = true;
        return hasPath(matrix, rows, cols, str, index + 1, i + 1, j, visited) ||
                hasPath(matrix, rows, cols, str, index + 1, i - 1, j, visited) ||
                hasPath(matrix, rows, cols, str, index + 1, i, j + 1, visited) ||
                hasPath(matrix, rows, cols, str, index + 1, i, j - 1, visited);

    }


}
