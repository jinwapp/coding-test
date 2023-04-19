import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 스택의 동작을 직접 구현
// size와 stack[size]를 주의하여야 한다
// size = 데이터의 개수
// stack[size -1] = 스택의 가장 위 데이터

public class BJ10828_Stack {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //횟수

        StringTokenizer st;

        stack = new int[N];

        while (N-- >= 0) {
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {

                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    System.out.println(pop());
                    break;

                case "size":
                    System.out.println(size());
                    break;

                case "empty":
                    System.out.println(empty());
                    break;

                case "top":
                    System.out.println(top());
                    break;
            }
        }
    }

    public static void push(int n) {
        stack[size] = n;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int res = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return res;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        } else return 0;
    }

    public static  int top() {
        if (size == 0) {
            return -1;
        } else {
            return stack[size - 1];
        }
    }

}