import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ14425_StringArray {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] S = new String[N];
        String[] list = new String[M];

        for (int i = 0; i < N; i++) {
            S[i] = br.readLine();
        }

        for (int i = 0; i < M; i++) {
            list[i] = br.readLine();
        }

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (S[i].equals(list[j])) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}