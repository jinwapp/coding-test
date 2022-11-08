import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
    1. 입력을 받는다.
    2. 반복한다.
        1. charAt()는 문자, 아스키코드 숫자로 표현되므로 조건문을 사용한다.
            2. 해당되면 걸리는 시간을 축적한다.
    3. 반복문이 종료되면 출력한다.

 */

public class BJ5622_Dial {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int count = 0;
        int N = str.length();

        for (int i = 0; i < N; i++) {

            switch (str.charAt(i)) {
                case 'A', 'B', 'C' -> count += 3;
                case 'D', 'E', 'F' -> count += 4;
                case 'G', 'H', 'I' -> count += 5;
                case 'J', 'K', 'L' -> count += 6;
                case 'M', 'N', 'O' -> count += 7;
                case 'P', 'Q', 'R', 'S' -> count += 8;
                case 'T', 'U', 'V' -> count += 9;
                case 'W', 'X', 'Y', 'Z' -> count += 10;
            }
        }
        System.out.println(count);
    }
}

/*

public class BJ5622_Dial {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = 0;

        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'C') {
                res += 3;
            } else if ('D' <= str.charAt(i) && str.charAt(i) <= 'F') {
                res += 4;
            } else if ('G' <= str.charAt(i) && str.charAt(i) <= 'I') {
                res += 5;
            } else if ('J' <= str.charAt(i) && str.charAt(i) <= 'L') {
                res += 6;
            } else if ('M' <= str.charAt(i) && str.charAt(i) <= 'O') {
                res += 7;
            } else if ('P' <= str.charAt(i) && str.charAt(i) <= 'S') {
                res += 8;
            } else if ('T' <= str.charAt(i) && str.charAt(i) <= 'V') {
                res += 9;
            } else if ('W' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                res += 10;
            }
        }
        System.out.println(res);
    }
}
 */