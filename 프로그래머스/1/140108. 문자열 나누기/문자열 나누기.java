class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] sArray = s.toCharArray();
        char temp = ' ';
        int tempNum = 0;
        int trim = 0;
        int index = 0;
        for(char s1 : sArray) {
            if(tempNum == 0) {
                tempNum++;
                temp = s1;
                if(index == sArray.length-1 && tempNum != trim) {
                    answer++;
                    break;
                }
                index++;
                continue;
            }
            if(temp != s1) {
                trim++;
            } else if (temp == s1) {
                tempNum++;
            }
            if(tempNum == trim) {
                answer++;
                tempNum = 0;
                trim = 0;
            }
            index++;
            if(index == sArray.length-1 && tempNum != trim) {
                answer++;
                break;
            }
        }
        return answer;
    }
}