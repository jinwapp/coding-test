import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ10818_MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int index = 0;
        int[] arr = new int[N];

        while (st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N - 1]);
    }
}

/*
public class BJ10818_MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int min = Integer.parseInt(st.nextToken());
        int max = min;

        for (int i = 1; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());

            if (value < min) min = value;
            if (value > max) max = value;
        }

        System.out.println(min + " " + max);
    }
}
 */
/*
public class BJ10818_MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < N; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println(min + " " + max);
    }
}
 */