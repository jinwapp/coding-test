import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2750_NumberSort {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //선택정렬

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int val : arr) {
            System.out.println(val);
        }
    }
}

