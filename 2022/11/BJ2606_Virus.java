import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BJ2606_Virus {
    static int node[][]; // 그래프 배열
    static int check[]; // 방문 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 컴퓨터의 수
        int m = Integer.parseInt(br.readLine()); // 연결되어 있는 컴퓨터 쌍의 수 즉, 간선의 수

        node = new int[n + 1][n + 1];
        check = new int[n + 1];
        for (int i = 0; i < m; i++) { // 그래프 구성
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());

            node[a][b] = 1;
            node[b][a] = 1;
        }
        bfs(1);
    }


    public static void bfs(int start) { // BFS 메소드
        Queue<Integer> q = new LinkedList<>();

        check[start] = 1;
        q.offer(start);

        int cnt = 0; // 감염된 컴퓨터의 수

        while (!q.isEmpty()) {
            int x = q.poll();

            for (int i = 1; i < node.length; i++) {
                if (node[x][i] == 1 && check[i] != 1) {
                    q.offer(i);
                    check[i] = 1;
                    cnt++;
                }
            }
        }
        System.out.println(cnt); // 모든 탐색을 마치고 cnt 출력
    }
}