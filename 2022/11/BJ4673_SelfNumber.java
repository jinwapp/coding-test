import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class BJ4673_SelfNumber {
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        int N = 10000;
        int sum = 0;
        int nmg = 0;
        int mok = 0;

        int[] arr = new int[11000];

        for (int i = 0; i < N; i++) {
            mok = i;
            sum = mok;
            while (mok != 0) {
                nmg = mok % 10;
                sum += nmg;
                mok = mok / 10;
            }
            arr[sum] = 1;
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] == 0) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}