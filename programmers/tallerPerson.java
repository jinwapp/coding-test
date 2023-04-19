
import java.io.IOException;
import java.util.Arrays;

public class tallerPerson {
    public static void main(String[] args) throws IOException {
        int[] array = {149, 180, 192, 170}; // 입력 1
        int height = 167; // 입력 2

        System.out.println(solution(array, height));

    }

    public static int solution(int[] array, int height) {
        int count = 0;
        for (int i : array) {
            if (i > height) {
                count++;
            }
        }
        return count;
    }
}

/**
 *     public static int solution(int[] array, int height) {
 *         return (int)Arrays.stream(array)
 *                 .filter(e -> e > height)
 *                 .count();
 *     }
 */