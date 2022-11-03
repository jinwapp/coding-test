import java.io.IOException;
import java.util.Scanner;

public class BJ11654_AsciiCode {

    // 출력값은 아스키코드 값이다.
    public static void main(String[] args) throws IOException {

        int a = System.in.read();
        System.out.println(a);
    }
}

/*
public class BJ11654_AsciiCode {

    // 출력값은 아스키코드 값이다.
    public static void main(String[] args) {

        1. 입력 String으로 입력 받는다.
        2. charAt() String에서 char로, 즉 문자열을 잘라 문자로 변환한다.
        3. 문자를 int 타입 변수에 저장함으로써 아스키 코드 값이 저장된다.

Scanner sc = new Scanner(System.in);

    int A = sc.nextLine().charAt(0);
        System.out.println(A);
    }
}
 */