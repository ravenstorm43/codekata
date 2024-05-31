import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> trinary = new ArrayList<Integer>();
        for(int i = n; i > 0; i = i / 3) {
            trinary.add(i % 3);
        }
        for(int j = trinary.size() - 1, k = 0; j >= 0 ; j--, k++) {
            answer += (trinary.get(j) * quarter(k));
        }
        //answer =  (trinary.get(3) * quarter(0)) + (trinary.get(2) * quarter(1)) + (trinary.get(1) * quarter(2));
        return answer;
    }
    public int quarter(int n) {
        int a = 1;
        for(int b = 0; b < n; b++) {
            a = a * 3;
        }
        return a;
    }
}