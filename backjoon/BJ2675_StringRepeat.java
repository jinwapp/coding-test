import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 3 = tokenizer
// ABC = tokenizer
// ABC.length 만큼 반복
// 3 만큼 반복
// str.char(j) 출력
// System.out.println();

public class BJ2675_StringRepeat {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // N 입력
        int N = Integer.parseInt(br.readLine());

        // N 만큼 반복
        for (int i = 0; i < N; i++) {

            String[] str = br.readLine().split(" ");

            int num = Integer.parseInt(str[0]);

            for (byte val : str[1].getBytes()) {
                for (int j = 0; j < num; j++) {
                    sb.append((char)val);
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}

/*
public class BJ2675_StringRepeat {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N 입력
        int N = Integer.parseInt(br.readLine());

        // N 만큼 반복
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < num; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
 */
