import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 색종이의 면적을 1로 표현하고 나중에 1의 갯수를 세면 된다.
public class BJ2563_ColorPaper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 색종이 개수
        int N = Integer.parseInt(br.readLine());
        int[][] res = new int[101][101];
        int sum = 0;

        String[] str = new String[N];
        // 색종이 시작점 입력
        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        // 반복문 N
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(str[i], " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 반복문 : X
            for (int j = x; j < x + 10; j++) {
                // 반복문 : Y
                for (int k = y; k < y + 10; k++) {
                    res[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                sum += res[i][j];
            }
        }
        System.out.println(sum);
    }
}