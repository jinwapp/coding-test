import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//카운팅 정렬 이용하여 풀었다.

public class BJ10816_NumberCard2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] arrM = new int[M];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
        }

        int[] res = new int[20000001];

        for (int i = 0; i < N; i++) {
            res[arrN[i]+10000000]++;
        }

        for (int i = 0; i < M; i++) {
            sb.append(res[arrM[i] + 10000000]).append(" ");
        }

        System.out.println(sb);
    }
}
