import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10809_FindAlphabet {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabet = new int[26];

        for (int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }

        //문자열 입력
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - 97;
            if (alphabet[digit] == -1) {
                alphabet[digit] = i;
            }
        }

        for (int i : alphabet) {
            System.out.print(i + " ");
        }

        // for str.길이만큼 반복한다.
            // 각 문자를 검사
            // if ( 배열[아스키코드-97] == -1)
            // 배열[문자아스키코드-97] = i
    }
}
