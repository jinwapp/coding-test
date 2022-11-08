import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BJ1152_WordLength {
    public static void main(String[] args) throws IOException {

        int count = 0;
        int pre_str = 32; // 공백을 의미한다.
        int str;

        while (true) {
            str = System.in.read();

            // 입력받은 문자가 공백일 때,
            if (str == 32) {
                // 이전의 문자가 공백이 아니면
                if (pre_str != 32) {
                    count++;
                }
            }
            
            // 입력받은 문자가 개행일 때 ('\n')
            else if (str == 10) {
                // 이전의 문자가 공백이 아니면
                if (pre_str != 32) count++;
                break;
            }
            pre_str = str;
        }
        System.out.println(count);
    }
}

/*
public class BJ1152_WordLength {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int cnt = 0;

        while (st.hasMoreTokens()) {
            st.nextToken();
            cnt++;
        }
        System.out.println(cnt);
    }
}
 */