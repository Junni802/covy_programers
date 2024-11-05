package covy.programers.pccp;

import org.junit.jupiter.api.Test;

class PuzzleGameTest {

    public long calcTotalTime(int[] diffs, int[] times, int curLevel) {
        long totalTime = times[0]; // 첫 번째 문제는 무조건 풀 수 있으므로 초기 값을 설정

        // 두 번째 문제부터 마지막 문제까지 반복
        for (int i = 1; i < diffs.length; i++) {
            int curDiff = diffs[i]; // 현재 문제의 난이도
            int curTime = times[i]; // 현재 문제를 푸는 데 걸리는 시간
            int prevTime = times[i - 1]; // 이전 문제를 푸는 데 걸린 시간

            // 현재 난이도가 현재 숙련도 이하라면 바로 문제를 풀 수 있음
            if (curDiff <= curLevel) {
                totalTime += curTime;
            }
            // 현재 난이도가 현재 숙련도보다 크면 이전 문제로 돌아가야 함
            else {
                int cnt = curDiff - curLevel; // 차이만큼 추가 학습 필요
                totalTime += (prevTime + curTime) * cnt + curTime;
            }
        }

        return totalTime; // 총 소요 시간을 반환
    }

    public int solution(int[] diffs, int[] times, long limit) {
        int minNum = 1;
        int maxNum = 0;
        int jobResult = 0;
        for (int i = 0; i < times.length; i++) {
            if (i == 1) {
                maxNum = diffs[i];
            } else {
                if (maxNum < diffs[i]) {
                    maxNum = diffs[i];
                }
            }
            jobResult += times[i];
        }

        // 이분 탐색을 통해 조건에 맞는 숙련도를 찾음
        while (minNum < maxNum) {
            int mid = (minNum + maxNum) / 2; // 중간을 계산

            // 현재 숙련도에서 계산한 총 시간이 제한 시간보다 크면 레벨을 더 높여야 함
            if (limit < calcTotalTime(diffs, times, mid)) {
                minNum = mid + 1; // 숙련도를 올림
            }
            // 제한 시간 내에 풀 수 있으면 레벨을 줄여가며 최소한의 레벨을 찾음
            else {
                maxNum = mid; // 숙련도를 낮춤
            }
        }

        return maxNum; // 조건에 맞는 숙련도 반환
    }

    @Test
    void solution1() {
        int result = solution(new int[]{1, 99999, 100000, 99995}, new int[]{9999, 9001, 9999, 9001}, 3456789012L);
        System.out.println("result -> " + result);
    }
}