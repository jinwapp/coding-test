import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ11399_ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int res = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum = sum + arr[i]; // arr[0] -> arr[0] + arr[1] -> arr[0] + arr[1] + arr[2]
            res = sum + res; //
        }
        System.out.println(res);

        // 숫자 입력
        // 반복하면서 배열 정렬
        // sum에 넣어준다

    }
}
