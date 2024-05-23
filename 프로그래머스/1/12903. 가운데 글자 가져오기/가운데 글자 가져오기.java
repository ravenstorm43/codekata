class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 != 0) {
            answer += s.charAt((int) Math.ceil(s.length() / 2.0) - 1);
        } else {
            answer = answer + s.charAt(s.length() / 2 - 1) + s.charAt(s.length() / 2);
        }
        return answer + "";
    }
}