class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String[] subs = new String[t.length()-p.length()+1];
        for(int i = 0; i < t.length()-p.length()+1; i++) {
            subs[i] = t.substring(i, i+p.length());  
            if(Long.parseLong(subs[i]) <= Long.parseLong(p)) {  
                answer++;
            }
        }
        return answer;
    }
}