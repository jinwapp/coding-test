import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2720_DongHyuk {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            sb.append(num/25).append(" ");
            num %= 25;

            sb.append(num / 10).append(" ");

            num %= 10;

            sb.append(num / 5).append(" ");
            num %= 5;

            sb.append(num / 1).append("\n");
        }
        System.out.println(sb);
    }
}
