class Solution {
    public boolean solution(int x) {
        String x1 = String.valueOf(x);
        int[] a = new int[x1.length()];
        int b = 0;
        for(int i = 0; i < x1.length(); i++) {
            a[i] = Character.getNumericValue(x1.charAt(i));
            b += a[i];
        }
        boolean answer = true;
        if(x % b == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}