import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] n1 = String.valueOf(n).split("");
        Arrays.sort(n1);
        StringBuilder builder = new StringBuilder();
        for(String a : n1) {
            builder.append(a);
        }
        return Long.parseLong(builder.reverse().toString());
    }
    public int[] sort(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] < a[j]) {
                    int temp = 0;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp; 
                }
            }
        }
        return a;
    }
}