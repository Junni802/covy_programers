package covy.programers.pccp;

import java.util.HashSet;
import java.util.Set;

public class FindTheRiskOfCollision {
    public int solution(int[][] points, int[][] routes) {
        int answer = 0;
        Set<String> set = new HashSet<>();
        for (int i=0; i<routes.length; i++) {
            for (int j=0; j<routes[i].length; j++) {
                System.out.println("값들을 확인해 보자 -> " + routes[i][j]);
            }
        }
        return answer;
    }
}
