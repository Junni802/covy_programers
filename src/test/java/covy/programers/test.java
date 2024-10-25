package covy.programers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.regex.Pattern;

@SpringBootTest
public class test {
    @Test
    void test(){
        String resultData = "";
        String s = "one4seveneight";

        String[] arrayList = s.split("");
        for (int i = 0; i < arrayList.length;) {
            boolean result = Pattern.matches("^[a-z]*$", arrayList[i]);
            System.out.println("찾는 값들 -> " + arrayList[i]);
            if (result) {
                if (i == 0) {
                    switch (arrayList[i]) {
                        case "o": {
                            resultData = resultData + "1";
                            i = i + 3;
                            break;
                        }
                        case "t": {
                            if (arrayList[i+1].equals("w")) {
                                resultData = resultData + "2";
                                i = i + 3;
                                break;
                            } else {
                                resultData = resultData + "3";
                                i = i + 5;
                                break;
                            }
                        }
                        case "f": {
                            if (arrayList[i+1].equals("o")) {
                                resultData = resultData + "4";
                                i = i + 4;
                                break;
                            } else {
                                resultData = resultData + "5";
                                i = i + 4;
                                break;
                            }
                        }
                        case "s": {
                            if (arrayList[i+1].equals("i")) {
                                resultData = resultData + "6";
                                i = i + 3;
                                break;
                            } else {
                                resultData = resultData + "7";
                                i = i + 5;
                                break;
                            }
                        }
                        case "e": {
                            resultData = resultData + "8";
                            i = i + 5;
                            break;
                        }
                        case "n": {
                            resultData = resultData + "9";
                            i = i + 4;
                            break;
                        }
                    }
                } else {
                    switch (arrayList[i]) {
                        // 첫 시작이 0으로 시작하지 않는다고 하여서 조건절 추가
                        case "z": {
                            resultData = resultData + "0";
                            i = i + 4;
                            break;
                        }
                        case "o": {
                            resultData = resultData + "1";
                            i = i + 3;
                            break;
                        }
                        case "t": {
                            if (arrayList[i+1].equals("w")) {
                                resultData = resultData + "2";
                                i = i + 3;
                                break;
                            } else {
                                resultData = resultData + "3";
                                i = i + 5;
                                break;
                            }
                        }
                        case "f": {
                            if (arrayList[i+1].equals("o")) {
                                resultData = resultData + "4";
                                i = i + 4;
                                break;
                            } else {
                                resultData = resultData + "5";
                                i = i + 4;
                                break;
                            }
                        }
                        case "s": {
                            if (arrayList[i+1].equals("i")) {
                                resultData = resultData + "6";
                                i = i + 3;
                                break;
                            } else {
                                resultData = resultData + "7";
                                i = i + 5;
                                break;
                            }
                        }
                        case "e": {
                            resultData = resultData + "8";
                            i = i + 5;
                            break;
                        }
                        case "n": {
                            resultData = resultData + "9";
                            i = i + 4;
                            break;
                        }

                    }
                }
            } else {
                // 숫자일 경우 그냥 더한다
                resultData = resultData + arrayList[i];
                i++;
            }
        }
        System.out.println("결과값 -> " + Integer.parseInt(resultData));
    }
}
