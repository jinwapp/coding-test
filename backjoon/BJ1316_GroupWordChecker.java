import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    1. 숫자 N을 입력 받는다.
    2. 0 ~ n 반복하면서 입력한다.
    3. boolean [26]을 만든다.
    4. str.char(i) 돌면서 aaaabbbb
        이전꺼랑 == 이면 continue
        다른데
            true면 break
            false면 true로 바꿔준다.
            prev = now
 */

public class BJ1316_GroupWordChecker {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (check() == true) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean check() throws IOException {
        String str = br.readLine();
        int prev = 0;
        boolean[] check = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);


            if (now == prev) {
                continue;
            }

            else {
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}