import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ18108_Thailand {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int king = 1;
        int queen = 1;
        int look = 2;
        int bishop = 2;
        int knite = 2;
        int pon = 8;

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        king = king - Integer.parseInt(st.nextToken());
        queen = queen - Integer.parseInt(st.nextToken());
        look = look - Integer.parseInt(st.nextToken());
        bishop = bishop - Integer.parseInt(st.nextToken());
        knite = knite - Integer.parseInt(st.nextToken());
        pon = pon - Integer.parseInt(st.nextToken());

        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(look + " ");
        System.out.print(bishop + " ");
        System.out.print(knite + " ");
        System.out.print(pon);
    }
}