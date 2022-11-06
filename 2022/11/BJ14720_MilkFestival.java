import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    1. 입력 N
    2. 가게 정보 입력 (N)
    3.  N 만큼 반복한다.
        if 0이면
        cnt ++
            if 1이면
            cnt ++
                if 2이면
                cnt++
    cnt 출력
 */

public class BJ14720_MilkFestival {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = st.nextToken();
        }

        String a ="0";

        for (int i = 0; i < N; i++) {
            if (cnt == 0) {
                if (arr[i].equals("0")) {
                    cnt++;
                    a = arr[i];
                }
            }

            if (a.equals("0") && arr[i].equals("1")) {
                cnt++;
                a = "1";
            } else if (a.equals("1") && arr[i].equals("2")) {
                cnt++;
                a = "2";
            } else if (a.equals("2") && arr[i].equals("0")) {
                cnt++;
                a = "0";
            }
        }
        System.out.println(cnt);
    }
}
