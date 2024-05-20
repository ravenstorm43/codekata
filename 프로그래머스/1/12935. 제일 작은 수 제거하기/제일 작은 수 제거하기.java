import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length - 1 <= 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            List<Integer> arr1 = new ArrayList();
            int min = Integer.MAX_VALUE;
            for(int i : arr) {
                if(i < min) {
                    min = i;
                }
            }
            for(int i : arr) {
                if (i != min) {
                    arr1.add(i);
                }
            }
            answer = new int[arr.length - 1];
            for(int i = 0; i < answer.length; i++) {
                answer[i] = arr1.get(i);
            }
            return answer;
        }
        
    }
}
