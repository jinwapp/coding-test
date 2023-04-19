import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2748_FibonacciNumber2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        long[] fibonacci = new long[num + 1];

        for (int i = 0; i <= num; i++) {
            if (i == 0) fibonacci[0] = 0;
            else if (i == 1) fibonacci[1] = 1;
            else fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println(fibonacci[num]);
    }
}

//public class BJ2748_FibonacciNumber2 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//
//        System.out.println(fibonacci(n));
//    }
//
//    public static int fibonacci(int num){
//        if (num == 0) return 0;
//        if (num == 1) return 1;
//
//        return fibonacci(num - 1) + fibonacci(num - 2);
//    }
//}
