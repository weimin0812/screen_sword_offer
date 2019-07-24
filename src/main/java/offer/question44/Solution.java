package offer.question44;

public class Solution {
    public static void main(String[] args) {
        String str = "I am a student.";
        ReverseSentence(str);

    }

    public static String ReverseSentence(String str) {
        if (str == null || str.length() == 0 || "".equals(str.trim())) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        String[] sArray = str.split(" ");
        for (int i = sArray.length - 1; i >= 0; i--) {
            sb.append(sArray[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();

    }
}
