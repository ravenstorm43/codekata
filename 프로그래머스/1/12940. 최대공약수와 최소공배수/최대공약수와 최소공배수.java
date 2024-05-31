class Solution {
    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcs = lcs(n, m);
        int[] answer = {gcd, lcs};
        return answer;
    }
    public int gcd(int val1, int val2) {
        if (val2 == 0) {
            return val1;
        }
        return gcd(val2, val1 % val2);
    }
    public int lcs(int val1, int val2) {
        int gcd = gcd(val1, val2);
        return Math.abs(val1*val2) / gcd;
    }
}