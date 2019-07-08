package offer.question09;

public class Solution {
    public int JumpFloorII(int target) {
        return 1 << (target - 1);
    }
}
