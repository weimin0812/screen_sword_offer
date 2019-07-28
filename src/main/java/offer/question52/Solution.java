package offer.question52;

public class Solution {
    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) {
            return false;
        }

        return match(str, 0, pattern, 0);
    }

    private boolean match(char[] str, int strIndex, char[] pattern, int patternIndex) {
        if (strIndex == str.length && patternIndex == pattern.length) {
            return true;
        }
        if (strIndex != str.length && patternIndex == pattern.length) {
            return false;
        }

        if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
            if (strIndex < str.length && (str[strIndex] == pattern[patternIndex] || pattern[patternIndex] == '.')) {
                return match(str, strIndex + 1, pattern, patternIndex)
                        || match(str, strIndex + 1, pattern, patternIndex + 2)
                        || match(str, strIndex, pattern, patternIndex + 2);
            } else {
                return match(str, strIndex, pattern, patternIndex + 2);
            }

        }

        if (strIndex < str.length && (str[strIndex] == pattern[patternIndex] || pattern[patternIndex] == '.')) {
            return match(str, strIndex + 1, pattern, patternIndex + 1);
        }

        return false;
    }
}
