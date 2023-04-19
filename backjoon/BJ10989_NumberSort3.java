import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class BJ10989_NumberSort3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int value : arr) {
            sb.append(value).append("\n");
        }
        
        System.out.println(sb);
    }
}

/*

public class BJ2750_NumberSort_CountingSort {

    // 출력값은 아스키코드 값이다.
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        selection_sort(arr, arr.length);
    }

    public static void selection_sort(int[] arr, int size) {

        for (int i = 0; i < size - 1; i++) {
            int min_index = i;

            // 최소값을 갖고있는 인덱스 찾기
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            // i번째 값과 찾은 최소값을 서로 교환
            swap(arr, i, min_index);
        }

        for (int val : arr) {
            System.out.println(val);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
 */