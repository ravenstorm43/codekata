class Solution {
    public long solution(long n) {
        String n1 = String.valueOf(n);
        int[] n1Array = new int[n1.length()];
        for(int i = 0; i < n1.length(); i++) {
            n1Array[i] = Character.getNumericValue(n1.charAt(i));
        }
        sort(n1Array);
        long answer = 0;
        for(int i = 0; i < n1Array.length; i++) {
            answer = answer * 10 + n1Array[i];
        }
        return answer;
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