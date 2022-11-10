//import java.util.ArrayList;
//
//public class Selection_Sort {
//
//    public static void selection_sort(int[] a) {
//        selection_sort(a, a.length);
//    }
//
//    public static void selection_sort(int[] a, int size) {
//
//        for (int i = 0; i < size - 1; i++) {
//            int min_index = i;
//
//            //최소값을 갖고있는 인덱스 찾기
//            for (int j = i + 1; j < size; j++) {
//                if (a[j] < a[min_index]) {
//                    min_index = j;
//                }
//            }
//
//            // i번째 값과 찾은 최소값을 서료 교환
//            swap(a, i, min_index);
//
//        }
//    }
//
//    private static void swap(int a[], int i, int j) {
//        int temp = a[j];
//        a[j] = a[i];
//        a[i] = temp;
//    }
//}