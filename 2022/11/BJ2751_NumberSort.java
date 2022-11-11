//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
///*
//    1. N과 M을 구한다.
//    2. N+M만큼 반복하면서 이름을 입력한다.
//    3. L1 듣도 못한 사람을 정렬시킨다.
//    4. L2 보도 못한 사람을 정렬시킨다.
//    5. 비교하면서 동일하면 cnt++ 와 sb에 추가한다.
//    6. 출력
// */
//
//public class BJ2751_NumberSort {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//        String[] L1 = new String[N];
//        String[] L2 = new String[M - 1];
//
//        String[] str = new String[N + M];
//
//        for (int i = 0; i < N + M; i++) {
//            str[i] = br.readLine();
//        }
//
//        for (int i = 0; i < N; i++) {
//            L1[i] = str[i];
//        }
//
//        for (int i = N + 1; i < N + M; i++) {
//             str[i];
//        }
//
//
//        selection_sort()
//
//
//        /*
//    1. N과 M을 구한다.
//    2. N+M만큼 반복하면서 이름을 입력한다.
//    3. L1 듣도 못한 사람을 정렬시킨다.
//    4. L2 보도 못한 사람을 정렬시킨다.
//    5. 비교하면서 동일하면 cnt++ 와 sb에 추가한다.
//    6. 출력
// */
//    }
//
//    public static int[] selection_sort(int[] arr, int size) {
//        for (int i = 0; i < size - 1; i++) {
//            int min_index = i;
//            for (int k = i; k < size; k++) {
//                if (arr[min_index] > arr[k]) {
//                    min_index = k;
//                }
//            }
//            swap(arr, i, min_index);
//        }
//        return arr;
//    }
//
//    public static void swap(int[] arr, int i, int k) {
//        int temp = arr[k];
//        arr[k] = arr[i];
//        arr[i] = temp;
//
//    }
//}