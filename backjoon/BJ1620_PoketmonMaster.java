import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


public class BJ1620_PoketmonMaster {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String,String> arrN = new HashMap<>();
        String[] arrM = new String[M];

        for (int i = 1; i <= N; i++) {
            String pocketmon = br.readLine();

            arrN.put(Integer.toString(i), pocketmon);
            arrN.put(pocketmon, Integer.toString(i));
        }

        for (int i = 0; i < M; i++) {
            sb.append(arrN.get(br.readLine())).append("\n");
        }
        System.out.println(sb);
    }
}

/* 시간초과 발생
public class BJ1620_PoketmonMaster {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer,String> arrN = new HashMap<>();
        String[] arrM = new String[M];

        for (int i = 1; i <= N; i++) {
            arrN.put(i, br.readLine());
        }

        for (int i = 0; i < M; i++) {
            arrM[i] = br.readLine();
        }

        for (int i = 0; i < M; i++) {
            if (48 <= arrM[i].charAt(0) && arrM[i].charAt(0) < 58) {
                sb.append(arrN.get(Integer.parseInt(arrM[i]))).append("\n");
            } else {
                for (int key : arrN.keySet()) {
                    if (arrN.get(key).equals(arrM[i])) {
                        sb.append(key).append("\n");
                    }
                }
            }

        }
        System.out.println(sb);
    }
}

 */
