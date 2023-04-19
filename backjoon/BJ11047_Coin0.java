import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
        // 입력 N(동전의 종류) , K(금액)를 받는다.
        // 반복하면서 입력을 쭈루룩 입력한다.
        // 반복문을 설정한다.
        // 금액이 큰 종류가 작은 경우
            // 나눈 몫을 cnt에 더하고
            // K에 나머지를 저장한다.
 */
public class BJ11047_Coin0 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;

        for (int i = N - 1; i >= 0; i--) {
            if (arr[i] <= K) {
                int num = K / arr[i];
                cnt += num;
                K = K % arr[i];
            }
        }

        System.out.println(cnt);

    }
}