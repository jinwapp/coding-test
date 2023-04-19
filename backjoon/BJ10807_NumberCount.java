import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10807_NumberCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] value = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int res = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            value[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            if (value[i] == res) cnt++;
        }
        System.out.println(cnt);
    }
}

/*
public class BJ10807_NumberCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int C = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            if (C == Integer.parseInt(st.nextToken())) cnt++;
        }
        System.out.println(cnt);
    }
}
 */