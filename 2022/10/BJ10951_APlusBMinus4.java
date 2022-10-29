import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10951_APlusBMinus4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "";
        StringTokenizer st;

        while ((str=br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            sb.append(a + b).append("\n");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())+"\n");
        }
        System.out.println(sb);
    }
}