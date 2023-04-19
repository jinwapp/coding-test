
import java.io.IOException;
import java.util.Arrays;

public class duplicateNumbers {
    public static void main(String[] args) throws IOException {
        int[] array = {1, 1, 2, 3, 4, 5}; // 입력 1
        int n = 1; // 입력 2

        System.out.println(solution(array, n));

    }

    public static int solution(int[] array, int n) {
        return (int) Arrays.stream(array)
                .filter(i -> i == n)
                .count();
    }
}


/**
 *     public static int solution(int[] array, int n) {
 *         int answer = 0;
 *         for (int num : array) {
 *             if (num == n) answer++;
 *         }
 *         return answer;
 *     }
 */