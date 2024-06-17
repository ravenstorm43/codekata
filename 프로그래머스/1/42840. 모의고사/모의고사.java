import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        int[] rank = new int[3];
        List<Integer> answer = new ArrayList();
        int[] score = {0, 0, 0};
        int j = 0;
        for(int i = 0; i < answers.length; i++) {
            if((i % 5) + 1 == answers[i]) {
                score[0]++;
            }
            if(i % 2 != 0) {
                if(j % 4 == 0) {
                    if(answers[i] == 1) {
                        score[1]++;
                    }
                } else if(j % 4 == 1) {
                    if(answers[i] == 3) {
                        score[1]++;
                    }
                } else if(j % 4 == 2) {
                    if(answers[i] == 4) {
                        score[1]++;
                    }
                } else if(j % 4 == 3) {
                    if(answers[i] == 5) {
                        score[1]++;
                    }
                }
                j++;
            } else {
                if(answers[i] == 2) {
                    score[1]++;
                }
            }
            if(i % 10 == 0 || i % 10 == 1) {
                if(answers[i] == 3) {
                    score[2]++;
                }
            } else if(i % 10 == 2 || i % 10 == 3) {
                if(answers[i] == 1) {
                    score[2]++;
                }
            } else if(i % 10 == 4 || i % 10 == 5) {
                if(answers[i] == 2) {
                    score[2]++;
                }
            } else if(i % 10 == 6 || i % 10 == 7) {
                if(answers[i] == 4) {
                    score[2]++;
                }
            } else if(i % 10 == 8 || i % 10 == 9) {
                if(answers[i] == 5) {
                    score[2]++;
                }
            }
        }
        int maxScore = maxScore(score[0], score[1], score[2]);
        int man = firstMan(score[0], score[1], score[2]);
        answer.add(man);
        if(maxScore == score[2] && !answer.contains(3)) {
            answer.add(3);
        }
        if(maxScore == score[1] && !answer.contains(2)) {
            answer.add(2);
        }
        if(maxScore == score[0] && !answer.contains(1)) {
            answer.add(1);
        }
        Collections.sort(answer);
        return answer;
    }
    int maxScore(int a, int b, int c) {
        int max_int = 0;
        if(a > max_int) {
            max_int = a;
        }
        if(b > max_int) {
            max_int = b;
        }
        if(c > max_int) {
            max_int = c;
        }
        return max_int;
    }
    int firstMan(int a, int b, int c) {
        int max_int = 0;
        int man = 0;
        if(a > max_int) {
            max_int = a;
            man = 1;
        }
        if(b > max_int) {
            max_int = b;
            man = 2;
        }
        if(c > max_int) {
            max_int = c;
            man = 3;
        }
        return man;
    }
}