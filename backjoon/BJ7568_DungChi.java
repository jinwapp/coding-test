import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//브루트포스 알고리즘
public class BJ7568_DungChi {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] x = new int[N];
        int[] y = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < N; i++) {
            int cnt = 1;
            for (int j = 0; j < N; j++) {
                if (x[i] < x[j] && y[i] < y[j]) {
                    cnt++;
                }
            }
            sb.append(cnt + " ");
        }
        System.out.println(sb);
        // 사람의 수 N 입력 받는다.
        // N번 반복하면서 x y 배열에 토큰으로 x y 를 넣는다.
        // 0번 사람부터 N-1사람까지 반복하면서
            // x < i , y <i 면
                // cnt(기본1) ++
            //sb에 추가
        // 출력
    }
}