class Solution {
    public int[] solution(long n) {
        String n1 = String.valueOf(n);
        int[] answer = new int[n1.length()];
        for(int i = 0; i < n1.length(); i++) {
            answer[i] = Character.getNumericValue(n1.charAt(n1.length() - i - 1));
        }
        return answer;
    }
}