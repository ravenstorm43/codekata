class Solution {
    public long[] solution(long x, int n) { // x는 -10000000 이상, 10000000 이하인 정수여서 long형으로 선언
        long[] answer = new long[n];
        for(int i = 0; i < n; i++) {
            answer[i] = x * (i + 1);
        }
        return answer;
    }
}
