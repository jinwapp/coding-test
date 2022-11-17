import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2750_NumberSort_CountingSort {

    // 카운팅 정렬
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        /*
        개수(N) : 1000개
        범위 : boolean[] bl = new boolean[2000]
                -1000 ~ 1000
         */

        boolean[] arr = new boolean[2000];

        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine())+1000] = true;
        }

        for (int i = 0; i < 2001; i++) {
            if (arr[i]) System.out.println(i);
        }
    }
}
