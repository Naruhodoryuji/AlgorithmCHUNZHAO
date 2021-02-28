//lc232.2的幂 网址:https://leetcode-cn.com/problems/power-of-two/
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        while (n > 1) {
            if ((n & 1) == 0) n = n >> 1;
            else return false;
        }
        return true;
    }
}