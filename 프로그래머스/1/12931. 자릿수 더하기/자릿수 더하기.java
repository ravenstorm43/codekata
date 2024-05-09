import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = String.valueOf(n);
        for(int i = 0; i < temp.length(); i++) {
            answer += Character.getNumericValue(temp.charAt(i));    // Character.getNumericValue():매개변수로 받은 문자를 정수로 바꾸는 메소드
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
