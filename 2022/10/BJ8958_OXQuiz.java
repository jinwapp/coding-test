import java.io.*;
import java.util.StringTokenizer;

public class BJ8958_OXQuiz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int test_case = Integer.parseInt(br.readLine());	//테스트 케이스

        String arr[] = new String[test_case];

        for (int i = 0; i < test_case; i++) {
            arr[i] = br.readLine();
        }


        for (int i = 0; i < test_case; i++) {

            int cnt = 0;	// 연속횟수
            int sum = 0;	// 누적 합산

            for (int j = 0; j < arr[i].length(); j++) {

                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }

            sb.append(sum).append('\n');
        }

        System.out.print(sb);
    }
}
/*

public class BJ8958_OXQuiz {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        int R = 0;
        int Sum = 0;

        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == 'O') {
                    R++;
                    Sum += R;
                } else if (str[i].charAt(j) == 'X'){
                    R = 0;
                }
            }
            sb.append(Sum).append("\n");
            R = 0;
            Sum = 0;
        }
        br.close();

        System.out.println(sb);
    }
}
 */