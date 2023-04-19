import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bj10950_APlusBMinus3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int arr[] = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a + b;
        }
        sc.close();

        for (int k : arr) {
            System.out.println(k);
        }
    }
}

/*
public class Bj10950_APlusBMinus3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String str = br.readLine();

            StringTokenizer st = new StringTokenizer(str, " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a + b);
            sb.append("\n");

        }
        System.out.println(sb);
    }
}
*/