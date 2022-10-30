import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BJ3052_Reminder {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[42];

        for (int i = 0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine())%42] = true;
        }
        int cnt = 0;
        for (Boolean value : arr) {
            if (value) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
/*
public class BJ3052_Reminder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            h.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(h.size());
    }
}
 */
/*
public class BJ3052_Reminder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[43];
        int cnt = 0;

        for (int i = 1; i <= 10; i++) {
            int index = Integer.parseInt(br.readLine()) % 42;
            arr[index] = 1;
        }

        for (int i = 0; i <= 42; i++) {
            if (arr[i] == 1) {
                cnt++;
            }
        }

        System.out.println(cnt);

        //입력 10개 받는다.
        //index = 입력 % 42
        // arr[index] = 1

        // 배열 42번까지 돌면서 value가 1이면 cnt++
        // cnt 출력
    }
}
 */