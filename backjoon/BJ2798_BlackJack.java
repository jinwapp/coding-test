import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//브루트 포스(Brute Force) : 무식한 힘

// 카드 개수 N과 숫자 M을 입력받는다.
// 각 카드의 정수를 입력한다.
// 가장 가까운 숫자 res

// for
//for
//for
// res-M > temp-M
// res = temp

public class BJ2798_BlackJack {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int res = 0;
        int temp = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    temp = arr[i] + arr[j] + arr[k];
                    if (temp <= M) {
                        if (M - res > M - temp) {
                            res = temp;
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
}