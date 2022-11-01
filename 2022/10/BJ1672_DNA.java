import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1672_DNA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String DNA = br.readLine();
        String res = "";

        for (int i = N - 1; i >= 1; i--) {
            if (DNA.charAt(i) == 'A') {
                if (DNA.charAt(i - 1) == 'A') {
                    DNA = DNA.substring(0, i - 1) + 'A';
                } else if (DNA.charAt(i - 1) == 'G') {
                    DNA = DNA.substring(0, i - 1) + 'C';
                } else if (DNA.charAt(i - 1) == 'C') {
                    DNA = DNA.substring(0, i - 1) + 'A';
                } else if (DNA.charAt(i - 1) == 'T') {
                    DNA = DNA.substring(0, i - 1) + 'G';
                }
            } else if (DNA.charAt(i) == 'G') {
                if (DNA.charAt(i - 1) == 'A') {
                    DNA = DNA.substring(0, i - 1) + 'C';
                } else if (DNA.charAt(i - 1) == 'G') {
                    DNA = DNA.substring(0, i - 1) + 'G';
                } else if (DNA.charAt(i - 1) == 'C') {
                    DNA = DNA.substring(0, i - 1) + 'T';
                } else if (DNA.charAt(i - 1) == 'T') {
                    DNA = DNA.substring(0, i - 1) + 'A';
                }
            } else if (DNA.charAt(i) == 'C') {
                if (DNA.charAt(i - 1) == 'A') {
                    DNA = DNA.substring(0, i - 1) + 'A';
                } else if (DNA.charAt(i - 1) == 'G') {
                    DNA = DNA.substring(0, i - 1) + 'T';
                } else if (DNA.charAt(i - 1) == 'C') {
                    DNA = DNA.substring(0, i - 1) + 'C';
                } else if (DNA.charAt(i - 1) == 'T') {
                    DNA = DNA.substring(0, i - 1) + 'G';
                }
            } else if (DNA.charAt(i) == 'T') {
                if (DNA.charAt(i - 1) == 'A') {
                    DNA = DNA.substring(0, i - 1) + 'G';
                } else if (DNA.charAt(i - 1) == 'G') {
                    DNA = DNA.substring(0, i - 1) + 'A';
                } else if (DNA.charAt(i - 1) == 'C') {
                    DNA = DNA.substring(0, i - 1) + 'G';
                } else if (DNA.charAt(i - 1) == 'T') {
                    DNA = DNA.substring(0, i - 1) + 'T';
                }
            }
        }
        System.out.println(DNA);
    }
}