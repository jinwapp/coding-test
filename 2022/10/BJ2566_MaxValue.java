import java.io.*;
import java.util.StringTokenizer;

//컴퓨터 처럼 생각한다.
public class BJ2566_MaxValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int x = 1;
        int y = 1;

        for (int i = 1; i <= 9; i++) {// 반복문 x
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= 9; j++) {//반복문 y
                int a = Integer.parseInt(st.nextToken());
                if (a > max) {
                    max = a;
                    x = i;
                    y = j;
                }
            }
        }
        bw.write(Integer.toString(max));
        bw.newLine();
        bw.write(Integer.toString(x) + " " + Integer.toString(y));
        bw.flush();
    }
}