package offer.question32;

public class Solution {
    public String PrintMinNumber(int[] numbers) {
        if (numbers == null) {
            return null;
        }

        for (int i = 0; i < numbers.length; i++) {
            boolean sorted = true;
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (larger(numbers[j], numbers[j + 1])) {
                    sorted = false;
                    swap(numbers, j, j + 1);
                }
            }

            if (sorted) {
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
        }

        return sb.toString();

    }

    private void swap(int[] numbers, int i, int j) {
        int t = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = t;
    }

    private boolean larger(int x, int y) {
        return (x + "" + y).compareTo(y + "" + x) > 0;
    }
}
