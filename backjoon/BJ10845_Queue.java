import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BJ10845_Queue {

    public static Deque<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());


        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    pop();
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

    public static void push(int n) {
        q.add(n);
    }

    public static void pop() {
        if (q.size() == 0) {
            System.out.println("-1");
        } else {
            System.out.println(q.poll());
        }
    }

    public static void size() {
        System.out.println(q.size());
    }

    public static void empty() {
        if (q.isEmpty()) System.out.println("1");
        else System.out.println("0");
    }
    public static void front() {
        if(q.size()==0) System.out.println("-1");
        else System.out.println(q.peek());
    }

    public static void back() {
        if (q.size()==0) System.out.println("-1");
        else System.out.println(q.peekLast());
//        else {
//            for (int i = 0; i < q.size() - 1; i++) {
//                q.add(q.poll());
//            }
//            System.out.println(q.peek());
//        }
    }
}

