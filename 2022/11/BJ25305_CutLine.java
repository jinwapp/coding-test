import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
    1. 응시 인원 : N 과 수상 인원 : K를 입력받는다.
    2. 0 ~ N 만큼 반복하면서 학생의 점수를 입력받는다.
    3.
 */
public class BJ25305_CutLine {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];


        st = new StringTokenizer(br.readLine(), " ");


        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        selection_sort(arr, arr.length);

        System.out.println(arr[N - K]);
    }

    public static int[] selection_sort(int[] arr, int size) {

        for (int i = 0; i < size - 1; i++) {
            int min_index = i;

            for (int k = i + 1; k < size; k++) {
                if (arr[min_index] > arr[k]) {
                    min_index = k;
                }
            }
            swap(arr, i, min_index);
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int k) {
        int temp = arr[k];
        arr[k] = arr[i];
        arr[i] = temp;
    }
}