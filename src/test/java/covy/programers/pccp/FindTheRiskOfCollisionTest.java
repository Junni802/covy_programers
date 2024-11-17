package covy.programers.pccp;

import org.junit.jupiter.api.Test;
import java.util.*;

class FindTheRiskOfCollisionTest {

    public int solution(int[][] points, int[][] routes) {
        int answer = 0;
        List<String> list = new ArrayList<>();
            for (int i = 0; i < routes.length; i++) {
                int num = 1;
                for (int j = 0; j < routes[i].length; j++) {
                    boolean result = true;
                    if (j != routes[i].length - 1) {
                        int nextX = points[routes[i][j + 1] - 1][0];
                        int nextY = points[routes[i][j + 1] - 1][1];
                        int currentX = points[routes[i][j] - 1][0];
                        int currentY = points[routes[i][j] - 1][1];
                        while (result) {
                            if (currentX < nextX){
                                currentX++;
                                String text = "[" + num +"]" + currentX + ", " + currentY;
                                if (list.contains(text)) {
                                    answer++;
                                    list.set(list.indexOf(text), "X");
                                }else {
                                    list.add(text);
                                }
                                num++;
                            }else if (currentX > nextX) {
                                currentX--;
                                String text = "[" + num +"]" + currentX + ", " + currentY;
                                if (list.contains(text)) {
                                    answer++;
                                    list.set(list.indexOf(text), "X");
                                }else {
                                    list.add(text);
                                }
                                num++;
                            } else {
                                if (currentY < nextY) {
                                    currentY++;
                                    String text = "[" + num +"]" + currentX + ", " + currentY;
                                    if (list.contains(text)) {
                                        answer++;
                                        list.set(list.indexOf(text), "X");
                                    }else {
                                        list.add(text);
                                    }
                                    num++;
                                }else if (currentY > nextY) {
                                    currentY--;
                                    String text = "[" + num +"]" + currentX + ", " + currentY;
                                    if (list.contains(text)) {
                                        answer++;
                                        list.set(list.indexOf(text), "X");
                                    }else {
                                        list.add(text);
                                    }
                                }else {
                                    result = false;
                                }
                            }
                        }

                    }
                }
            }

        return answer;
    }

    @Test
    void solutionTest() {
        int[][] points = {
                {1, 1},  // Point 1
                {1, 2},  // Point 2
                {1, 3},  // Point 3
                {2, 1},  // Point 4
                {2, 2}   // Point 5
        };

        int[][] routes = {
                {1, 2, 3}, // 경로 1: Point 1 -> Point 2 -> Point 3
                {4, 5, 3}  // 경로 2: Point 4 -> Point 5 -> Point 3 (충돌 발생)
        };

        // 매개변수로 전달
        solution(points, routes);
    }
}