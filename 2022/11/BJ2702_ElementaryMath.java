import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
        // 입력을 받는다.
        // 개수만큼 반복한다.
            // 대문자로 만들어서 +1 한다.
        // a ~ z까지 반복한다.
        // max를 구한다.
            //개수가 만약 같다면 "?" 출력한다.
 */
public class BJ2702_ElementaryMath {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();
        int N = str.length();
        int[] num = new int[26];
        int max = 0;
        int res = 0;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int a = str.charAt(i) - 'A';
            num[a] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if (num[i] > 0) {
                if (num[i] > max) {
                    max = num[i];
                    res = i;
                    cnt = 0;
                } else if (num[i] == max) {
                    cnt++;
                }
            }
        }

        if (cnt > 0) {
            System.out.println("?");
        } else if (max == 0) {
            System.out.println("?");
        } else {
            System.out.println((char)(res+65));
        }
    }
}
