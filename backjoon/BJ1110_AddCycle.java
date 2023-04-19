import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1110_AddCycle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int copy = N;
        int cnt = 0;

        do {
            N = (N % 10) * 10 + ((N / 10) + (N % 10)) % 10;
            cnt++;
        } while (copy != N);

        System.out.println(cnt);
    }
}
/*
import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class BJ1110_AddCycle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int temp = (N / 10) + (N % 10);
        int result = ((N % 10) * 10) + (temp % 10);
        int i = 1;


        while (N != result) {
            temp = (result / 10) + (result % 10);
            result = (result % 10) * 10 + (temp % 10);
            i++;
        }
        System.out.println(i);
    }
}
 */

/*
public class BJ1110_AddCycle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int copy = N;
        int i = 0;

        while (true) {

            N = (N % 10) * 10 + ((N / 10) + (N % 10)) % 10;
            i++;

            if (copy == N) {
                break;
            }
        }
        System.out.println(i);
    }
}
 */