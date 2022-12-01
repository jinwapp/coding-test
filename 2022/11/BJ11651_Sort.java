import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BJ11651_Sort {

    public static Deque<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push_front":
                    push_front(Integer.parseInt(st.nextToken()));
                    break;

                case "push_back":
                    push_back(Integer.parseInt(st.nextToken()));
                    break;

                case "pop_front":
                    pop_front();
                    break;

                case "pop_back":
                    pop_back();
                    break;

                case "size":
                    size();
                    break;

                case "empty":
                    empty();
                    break;

                case "front":
                    front();
                    break;

                case "back":
                    back();
                    break;

            }
        }

    }

    public static void push_front(int x) {
        q.addFirst(x);
    }

    public static void push_back(int x) {
        q.addLast(x);
    }

    public static void pop_front() {
        if (q.size() == 0) {
            System.out.println("-1");
        } else {
            System.out.println(q.pollFirst());
        }

    }

    public static void pop_back() {
        if (q.size() == 0) {
            System.out.println("-1");
        } else {
            System.out.println(q.pollLast());
        }
    }

    public static void size() {
        if (q.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(q.size());
        }
    }

    public static void empty() {
        if (q.isEmpty()) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static void front() {
        if (q.size() == 0) {
            System.out.println("-1");
        } else {
            System.out.println(q.getFirst());
        }
    }

    public static void back() {
        if (q.size() == 0) {
            System.out.println("-1");
        } else {
            System.out.println(q.getLast());
        }
    }
}

