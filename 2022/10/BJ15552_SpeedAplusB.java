import java.io.*;
import java.util.StringTokenizer;

public class BJ15552_SpeedAplusB {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int target = str.indexOf(" ");
            int result = Integer.parseInt(str.substring(0, target)) + Integer.parseInt(str.substring(target + 1));
            sb.append(result + "\n");
        }
        br.close();
        System.out.println(sb);
    }
}

/*
public class BJ15552_SpeedAplusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
        }
        System.out.println(sb);
    }
}
 */

/*
import java.io.*;
import java.util.StringTokenizer;

public class BJ15552_SpeedAplusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력: 테스트 케이스
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            //입력: a, b
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");

//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//
//            bw.write(a+b+"\n");

        }
        br.close();
        //결과 출력
        bw.flush();
        bw.close();
    }
}
 */