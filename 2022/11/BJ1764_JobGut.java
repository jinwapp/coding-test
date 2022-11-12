import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ1764_JobGut {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), 1);
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
            if (map.get(name) == 2) list.add(name);
        }

        StringBuilder sb = new StringBuilder();
        Collections.sort(list);
        sb.append(list.size()).append("\n");
        for (String str : list) {
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}

/* 시간초과가 난다... (이중 for문..)
public class BJ1764_JobGut {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] L1 = new String[N];
        String[] L2 = new String[M - 1];

        String[] str = new String[N + M];

        for (int i = 0; i < N + M; i++) {
            str[i] = br.readLine();
        }

        L1 = Arrays.copyOfRange(str, 0, N);
        L2 = Arrays.copyOfRange(str, N + 1, N + M);

        Arrays.sort(L1);
        Arrays.sort(L2);

        int cnt = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < L1.length; i++) {
            for (int k = 0; k < L2.length; k++) {
                if (L1[i].equals(L2[k])) {
                    cnt++;
                    sb.append(L1[i]).append("\n");
                }
            }
        }
        System.out.println(cnt);
        System.out.println(sb);
    }
}
 */
