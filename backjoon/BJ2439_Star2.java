import java.io.*;

public class BJ2439_Star2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N-i; j++) {
                bw.write(" ");
            }
            for (int k = N-i; k < N; k++) {
                bw.append("*");
            }
            bw.newLine();
        }
        br.close();

        bw.flush();
        bw.close();
    }
}

/*
public class BJ2439_Star2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N-i; j++) {
                sb.append(" ");
            }
            for (int k = N-i; k < N; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
 */