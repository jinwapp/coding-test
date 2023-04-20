
import java.io.IOException;
import java.util.Arrays;

public class evenOddNumber {
    public static void main(String[] args) throws IOException {
        int[] array = {1,2,3,4,5}; // 입력 1

        System.out.println(Arrays.toString(solution(array)));

    }

    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        for (int i : array) {
            if (i % 2 == 0) {
                answer[0]++;
            } else answer[1]++;
        }
        return answer;
    }
}

/**
 *     public static int[] solution(int[] array) {
 *         int[] answer = {0,0};
 *         for (int i : array) {
 *             if (i % 2 == 0) {
 *                 answer[0]++;
 *             } else answer[1]++;
 *         }
 *         return answer;
 *     }
 */
