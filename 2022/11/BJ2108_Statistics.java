import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.module.FindException;
import java.util.Arrays;
import java.util.Collections;

public class BJ2108_Statistics {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        System.out.println(Math.round(sum/N)); // 산술평균

        Arrays.sort(arr);

        int middle = (N / 2);
        System.out.println(arr[middle]); // 중앙값

        int[] cnts = new int[8001]; // 최빈값

        for (int i = 0; i < N; i++) {
            cnts[arr[i]+4000]++;
        }

        int max = -1;
        int index = 0;
        int fre = 0;

        for (int i = 0; i < 8001; i++) {
            if (cnts[i] >= max ) {
                if (cnts[i] == max && fre < 1) {
                    index = i;
                    fre++;
                } else if (cnts[i] > max){
                    max = cnts[i];
                    index = i;
                    fre = 0;
                }
            }
        }
        System.out.println(index-4000);

        int res = arr[N - 1] - arr[0];
        System.out.println(res);
        // 숫자 N을 받는다.
        // 정수를 N만큼 입력한다. (배열에 넣는다.)

        //1. 다 더해서 N으로 나눈다.
        //2. (N / 2) + 1 으로 배열 출력
        //3. Counting Sorting 으로 출력
        //4. 배열의 마지막과 처음을 뺀다.

    }
}
