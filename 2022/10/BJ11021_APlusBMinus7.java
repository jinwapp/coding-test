import java.io.*;

public class BJ11021_APlusBMinus7 {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력: 테스트 케이스
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            int target = str.indexOf(" ");
            int result = Integer.parseInt(str.substring(0, target)) + Integer.parseInt(str.substring(target + 1));
            bw.write("Case #" + i + ": " + result + "\n" );
        }
        br.close();

        bw.flush();
        bw.close();
    }
}