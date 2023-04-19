import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ5597_HomeworkPerson {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = new int[31];

        //28개 입력을 받는다.
        for (int i = 0; i < 28; i++) {
            int index = Integer.parseInt(br.readLine());
            input[index] = 1;
        }

        for (int i = 1; i <= 30; i++) {
            if (input[i] != 1) {
                System.out.println(i);
            }
        }
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