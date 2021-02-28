//lc191.位1的个数 网址:https://leetcode-cn.com/problems/number-of-1-bits/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n = n >>> 1; 
        }
        return count;
    }
}