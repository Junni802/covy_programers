package covy.programers.pccp;

import org.junit.jupiter.api.Test;

class PuzzleGameTest {

    public int solution(int[] diffs, int[] times, long limit) {
        int level = 0;

        boolean jobYn = false;
        int maxNum = 0;
        int jobResult = 0;
        for (int i=0; i<times.length; i++) {
            if (i == 1) {
                maxNum = diffs[i];
            }else {
                if (maxNum < diffs[i]) {
                    maxNum = diffs[i];
                }
            }
            jobResult += times[i];
        }

        if (limit > jobResult) {
            jobYn = true;
        }
        boolean resultYn = true;

        if (jobYn) {
            level = maxNum;
            while (resultYn) {
                level--;
                Long answer = 0L;
                for (int i = 0; i < diffs.length; i++) {
                    // 숙련도가 더 높을경우
                    if (level >= diffs[i]) {
                        answer += times[i];
                    }
                    // 숙련도가 더 낮을경우
                    else if (level < diffs[i]) {
                        answer += (long) (times[i] + times[i - 1]) * (diffs[i] - level) + times[i];
                    }

                }
                if (answer > limit) {
                    level++;
                    resultYn = false;
                }
            }
        } else {
            while (resultYn) {
                level++;
                Long answer = 0L;
                for (int i = 0; i < diffs.length; i++) {
                    // 숙련도가 더 높을경우
                    if (level >= diffs[i]) {
                        answer += times[i];
                    }
                    // 숙련도가 더 낮을경우
                    else if (level < diffs[i]) {
                        answer += (long) (times[i] + times[i - 1]) * (diffs[i] - level) + times[i];
                    }

                }
                if (answer < limit) {
                    resultYn = false;
                }
            }
        }
        return level;
    }

    @Test
    void solution1() {
        int result = solution(new int[]{1, 99999, 100000, 99995}, new int[]{9999, 9001, 9999, 9001}, 3456789012L);
        System.out.println("result -> " + result);
    }
}