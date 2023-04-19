import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.ByteChannel;

public class BJ11720_SumOfNumber {

    public static void main(String[] args) throws IOException {
        // BufferedReader을 쓰는 방법이자 charAt()을 사용하지 않고 하는 방법이다.

        // 우리는 문자열을 입력 받았을 때, 해당 문자열의 각 자릿값을 쉽게 반환받을 수 있는 방법이 있다.
        // -> getByte() 이다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();

        int sum = 0;

        for (byte value : br.readLine().getBytes()) { // getByte는 문자열 각 자리 수에 대한 아스키코드 값이 배열로 반환된다고 생각하면 된다.
            sum = sum + (value - '0');
        }
        System.out.println(sum);
    }
}

/*
    // 출력값은 아스키코드 값이다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += str.charAt(i) - 48; // '문자 0'(==아스키코드 숫자 48) - '0'(48) => 숫자 로 표현됨
        }
        System.out.println(sum);
    }
}
 */