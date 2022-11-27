import java.io.IOException;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class PG12906_NoSameNumber {
    public static void main(String[] args) throws IOException {
        int[] arr = {4,4,4,3,3};
        PG12906_NoSameNumber PG12906_NoSameNumber = new PG12906_NoSameNumber();
        PG12906_NoSameNumber.solution(arr);
    }

    public int[] solution(int[] arr) {
        Deque<Integer> q = new LinkedList<>();

        int N = arr.length;

        q.add(arr[0]);

        for (int i = 1; i < N; i++) {
            if (q.getLast().equals(arr[i])) {
                continue;
            } else {
                q.add(arr[i]);
            }
        }

        int N2 = q.size();
        int[] res = new int[q.size()];

        for (int i = 0; i < N2; i++) {
            res[i] = q.pollFirst();
        }
        return res;
    }
}