import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2908_SangSoo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(A > B ? A : B);
    }
}
/*

public class BJ2908_SangSoo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();


        String A = st.nextToken();
        String B = st.nextToken();

        for (int i = A.length() - 1; i >= 0; i--) {
            sb1.append(A.charAt(i));
            sb2.append(B.charAt(i));
        }

        int A1 = Integer.parseInt(sb1.toString());
        int B1 = Integer.parseInt(sb2.toString());

        if (A1 > B1) System.out.println(A1);
        else System.out.println(B1);
    }
}
 */