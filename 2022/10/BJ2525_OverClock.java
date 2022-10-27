import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2525_OverClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int hour = Integer.parseInt(str[0]); // 시간
        int min = Integer.parseInt(str[1]); // 분
        int c = Integer.parseInt(br.readLine()); // 소요되는 시간

        int total = hour * 60 + min + c; // 총 시간

        hour = (total / 60) % 24;
        min = total % 60;

        System.out.println(hour + " " +min);
    }
}

/*

public class BJ2525_OverClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        int plusHour = 0;

        if (min + c >= 60) {
            plusHour = (min + c) / 60;
            min = (min + c) % 60;
            hour = hour + plusHour;
        } else {
            min = min + c;
        }

        if (hour >= 24) {
            hour = hour % 24;
        }

        System.out.println(hour + " " + min);
    }
}
 */