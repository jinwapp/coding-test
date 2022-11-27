import java.io.IOException;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class PG12906_Test {
    public static void main(String[] args) throws IOException {
        long n = 13;
        System.out.println(Arrays.toString(solution(n)));
    }

    public static long[] solution(long n) {
        long min = 0;
        long max = 0;
        long[] res = new long[2];

        if (n % 7 == 6) {
            min = (n / 6) + (n % 6);
        } else {
            min = (n / 7) * 2;
        }

        if (n % 7 == 1) {
            max = (n / 6) + (n % 6);
        } else {
            max = ((n + 6) / 7) * 2;
        }

        res[0] = min;
        res[1] = max;

        return res;
    }
}