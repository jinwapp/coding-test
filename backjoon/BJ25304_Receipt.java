import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ25304_Receipt {
    public static void main(String[] args) throws IOException {
        // 영수증에 적힌 총 금액 X
        // 영수증에 적힌 구매한 물건의 종류의 수 N
        // 물건의 가격 : a / 개수 b

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            sum += a * b;
        }

        if (total == sum) System.out.println("Yes");
        else System.out.println("No");

    }
}