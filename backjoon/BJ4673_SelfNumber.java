import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 해당 수를 '생성자로 하는 수'가 있으면 그 수를 거른다.

public class BJ4673_SelfNumber {
    public static void main(String[] args) throws IOException { // 메일

        boolean[] check = new boolean[10001];
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10000; i++) {
            int n = d(i);

            if (n <= 10000) {
                check[n] = true;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (!check[i]) {
                sb.append(i + "\n");
            }
        }
        System.out.println(sb);
    }

    public static int d(int number) { // 함수 -> return 값 == '해당 number을 생성자로 하는 수'
        int sum = number;

        while (number != 0) {
            sum += (number % 10);
            number = number / 10;
        }
        return sum;
    }
}