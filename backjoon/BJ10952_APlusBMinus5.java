import java.io.*;
import java.util.StringTokenizer;

public class BJ10952_APlusBMinus5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            String str = br.readLine();
            int A = str.charAt(0) - 48;
            int B = str.charAt(2) - 48;

            if (A == 0 && B == 0) {
                break;
            }
            sb.append(A + B + "\n");
        }
        System.out.println(sb);
    }
}

/*
public class BJ10952_APlusBMinus5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0) {
                break;
            }
            sb.append(A + B + "\n");
        }
        System.out.println(sb);
    }
}
 */