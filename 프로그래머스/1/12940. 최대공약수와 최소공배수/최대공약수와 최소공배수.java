class Solution {
    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcs = lcs(n, m);
        int[] answer = {gcd, lcs};
        return answer;
    }
    public int gcd(int val1, int val2) {
        int i = val1;
        while(i > 1) {
            if(val2 % i == 0 && val1 % i == 0) {
                break;
            }
            i--;
        }
        return i;
    }
    public int lcs(int val1, int val2) {
        int i = val2;
        while(i < val1 * val2) {
            if(i % val1 == 0 && i % val2 == 0) {
                break;
            }
            i++;
        }
        return i;
    }
}