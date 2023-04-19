import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ2562_MaxValue {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int index = 0;
        for (int i = 0; i < 9; i++) {

            int val = Integer.parseInt(br.readLine());

            if (val > max) {
                max = val;
                index = i + 1;
            }
        }
        System.out.println(max + "\n" + index);
    }
}
/*

public class BJ2562_MaxValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) {
                max = arr[i];
                index = i+1;
            }
        }
        System.out.println(max + "\n" + index);
    }
}
 */