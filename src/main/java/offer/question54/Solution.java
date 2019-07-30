package offer.question54;

public class Solution {
    private StringBuilder sb = new StringBuilder();
    private int[] count = new int[256];

    //Insert one char from stringstream
    public void Insert(char ch) {
        sb.append(ch);
        count[ch]++;

    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        for (char c : sb.toString().toCharArray()) {
            if (count[c] == 1) {
                return c;
            }
        }

        return '#';
    }
}
