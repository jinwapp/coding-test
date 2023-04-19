import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
입력을 5개 받는다.

평균값 = 모든 합 / 5

중앙값 =  정렬 후, 2번째 (선택정렬)
 */
public class BJ2587_ImportantValue {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = 5;
        int[] arr = new int[N];
        int sum = 0;
        int avg = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        avg = sum / 5;
        arr = selection_sort(arr, arr.length);

        System.out.println(avg);
        System.out.println(arr[2]);
    }

    public static int[] selection_sort(int[] arr, int size) {

        for (int i = 0; i < size - 1; i++) {
            int min_index = i;
            for (int k = i; k < size; k++) {

                // 최소 index를 구한다.
                if (arr[min_index] > arr[k]) {
                    min_index = k;
                }
            }
            swap(arr, i, min_index);
        }
        return arr;
    }

    public static void swap(int arr[], int i, int k) {
        int temp = arr[k];
        arr[k] = arr[i];
        arr[i] = temp;
    }
}