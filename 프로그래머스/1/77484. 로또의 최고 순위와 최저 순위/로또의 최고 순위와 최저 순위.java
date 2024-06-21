class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int rank = 6;
        int nan = 0;
        int count = 0;
        for(int number : lottos) {
            if(number == 0) {
                nan++;
            }
            for(int win_num : win_nums) {
                if(number == win_num) {
                    count++;
                    if(count >= 2) {
                        rank--;
                    }
                }
            }
        }
        int min_rank = rank - nan;
        if(min_rank <= 0) {
            min_rank = 1;
        }
        int[] answer = {min_rank, rank};
        return answer;
    }
}