import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ1546_Average {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = -1;
        double sum = 0.0;

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());

            if (value > max) {
                max = value;
            }

            sum += value;
        }

        System.out.println(((sum / max) * 100.0) / N);
    }
}
/*
public class BJ1546_Average {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[N];
        double res = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        double max = arr[N - 1];

        for (int i = 0; i < N; i++) {
            arr[i] = (arr[i] / max) * 100;
            res = res + arr[i];
        }

        System.out.println(res / N);
    }
}
 */
// 입력을 하나 받는다.
// 입력을 개수만큼 받는다.
// max를 구한다.
// 돌면서 값을 변해준다.
// 평균을 출력한다.