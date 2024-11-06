package covy.programers.pccp;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FindTheRiskOfCollisionTest {

    public int solution(int[][] points, int[][] routes) {
        int answer = 0;
        Set<String> set = new HashSet<>();
        for (int i=0; i<routes.length; i++) {
            for (int j=0; j<routes[i].length; j++) {
                System.out.print("값들을 확인해 보자 -> " + routes[i][j]);
            }
            System.out.println();
        }
        return answer;
    }

    @Test
    void solutionTest() {
        int[][] points = {
                {4, 2},
                {1, 3},
                {2, 4}
        };

        int[][] routes = {
                {4, 2},
                {1, 3},
                {2, 4}
        };

        // 매개변수로 전달
        solution(points, routes);
    }
}