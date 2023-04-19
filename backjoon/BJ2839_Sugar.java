import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2839_Sugar {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int mok = n / 5;
        int nmg = 0;
        int sum = 0;

        for (int i = mok; mok >= 0; mok--) {
            nmg = n - (5 * mok);
            if (nmg % 3 == 0) {
                sum = mok + (nmg / 3);
                System.out.println(sum);
                System.exit(0);
            }
        }
        System.out.println("-1");
    }
}