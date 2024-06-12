class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        answer = func(a, b, n, answer);
        return answer;
    }
    public int func(int a, int b, int n, int result) {
        if(n < a) {
            return result;
        }
        return result + func(a, b, n / a * b + (n % a), n / a * b);
    }
}
// func(5, 2, 50, 0)
// 0 + func(5, 2, 20, )