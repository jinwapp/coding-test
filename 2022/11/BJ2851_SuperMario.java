import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2851_SuperMario {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];


        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine()); //10 20 30 40 50 60 70 80 90 100
        }

        int a1 = arr[0];
        int a2 = 0;

        for (int i = 1; i <= 9; i++) {
            a2 = a1 + arr[i];

            if (Math.abs(100 - a1) >= Math.abs(100 - a2)) {
                a1 = a2;
            } else {
                break;
            }
        }
        System.out.println(a1);
    }
}
