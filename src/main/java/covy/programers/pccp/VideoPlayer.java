package covy.programers.pccp;

import java.util.ArrayList;
import java.util.List;

public class VideoPlayer {
    public static void main(String[] args) {
        List<String> commands = new ArrayList<>();
        commands.add("next");
        commands.add("next");
        commands.add("next");
        commands.add("next");
        commands.add("next");

        String video_len = "10:55";
        String pos = "10:46";
        String op_start = "00:15";
        String op_end = "06:55";

        int totalCount = Integer.parseInt(video_len.substring(0, 2)) * 60 + Integer.parseInt(video_len.substring(3, 5));
        int firstStartTime = Integer.parseInt(op_start.substring(0, 2)) * 60 + Integer.parseInt(op_start.substring(3, 5));
        int lastEndtTime = Integer.parseInt(op_end.substring(0, 2)) * 60 + Integer.parseInt(op_end.substring(3, 5));
        int currentTime = Integer.parseInt(pos.substring(0, 2)) * 60 + Integer.parseInt(pos.substring(3, 5));

        int num = 1;
        for (String le : commands) {
            // 다음으로 넘겼나
            if (le.equals("next")) {
                if (num == 1) {
                    if (currentTime >= firstStartTime && currentTime < lastEndtTime) {
                        currentTime = lastEndtTime;
                    }
                    num++;
                }
                // 10을 플러스 하였을 경우 종료시간에 걸리는가?
                if (totalCount - 10 <= currentTime) {
                    currentTime = totalCount;
                } else {
                    currentTime = currentTime + 10;
                }
                // 오프닝 시간에 포함되었는가?
                if (currentTime >= firstStartTime && currentTime < lastEndtTime) {
                    currentTime = lastEndtTime;
                }
            }
            // 이전으로 넘겼냐
            else if (le.equals("prev")) {
                // 이전으로 되돌렸을 경우 초기보다 작은가?
                if (currentTime - 10 <= 0) {
                    currentTime = 0;
                } else {
                    currentTime = currentTime - 10;
                }
            }
        }
        int mmInt = currentTime / 60;
        int ssInt = currentTime % 60;

        String mm = mmInt < 10 ? "0" + mmInt : mmInt + "";
        String ss = ssInt < 10 ? "0" + ssInt : ssInt + "";
        String result = mm + ":" + ss;
        System.out.println("결과값 시간은 => " + mm + ":" + ss);
    }
}
