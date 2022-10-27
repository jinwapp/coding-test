import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2884_AlarmClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] time = br.readLine().split(" ");

        int h = Integer.parseInt(time[0]);
        int m = Integer.parseInt(time[1]);

        if (m > 45) m -= 45;
        else if (m == 45) m = 0;
        else {
            m += 15;
            h--;
        }


        if (h < 0) h = h + 24;

        System.out.println(h + " " + m);
    }
}