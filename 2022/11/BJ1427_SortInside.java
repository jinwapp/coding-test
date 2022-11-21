import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BJ1427_SortInside {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] counting = new int[10];
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            counting[str.charAt(i)-'0']++;
        }

        for (int i = 9; i >= 0; i--) {
            while (counting[i] != 0) {
                System.out.print(i);
                counting[i]--;
            }
        }
    }
}

/*
BufferedReader + toCharArray + Arrays.sort
    toCharArray() : 하나의 문자열을 각 자리의 아스키값으로 변환
 */
/*
public class BJ1427_SortInside {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
 */

/*
public class BJ1427_SortInside {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        String[] arr = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] =String.valueOf(str.charAt(i));
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < str.length(); i++) {
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}
 */