package covy.programers.pccp;

public class PuzzleGame {

    public int solution(int[] diffs, int[] times, long limit) {
        int level = 1;
        int result = 0;
        int answer = 0;

        for (int i=0; i<diffs.length; i++) {
            // 숙련도가 더 높을경우
            if (level >= diffs[i]) {
                answer += times[i];
            }
            // 숙련도가 더 낮을경우
            else if (level < diffs[i]) {
                answer += ((diffs[i] - level) * times[i - 1]) * times[i] + 2;
            }
            if (answer < limit) {
                return result;
            }else {
                result = answer;
            }
        }
        return result;
    }


}
