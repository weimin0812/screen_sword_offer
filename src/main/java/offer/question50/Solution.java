package offer.question50;

public class Solution {
    // 长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || numbers.length == 0 || numbers.length != length || duplication == null) {
            return false;
        }

        for (int i = 0; i < numbers.length; i++) {
            int index = numbers[i];
            if (numbers[i] < 0) {
                index += numbers.length;
            }

            if (numbers[index] < 0) {
                duplication[0] = index;
                return true;
            }

            numbers[index] = numbers[index] - numbers.length;
        }

        return false;
    }

}
