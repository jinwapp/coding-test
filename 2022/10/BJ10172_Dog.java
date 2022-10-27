import java.io.*;
import java.util.StringTokenizer;

public class BJ10172_Dog {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        sb.append("|\\_/|");
        sb.append("|q p|   /}\n");
        sb.append("( 0 )\"\"\"\\\n");
        sb.append("|\"^\"`    |\n");
        sb.append("||_/=\\\\__|\n");

        System.out.println(sb);
    }
}


/*
public class BJ10172_Dog {
    public static void main(String[] args) throws IOException {
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
    }
}
 */

/*
public class BJ10172_Dog {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("|\\_/|");
        bw.newLine();

        bw.write("|q p|   /}");
        bw.newLine();

        bw.write("( 0 )\"\"\"\\");
        bw.newLine();

        bw.write("|\"^\"`    |");
        bw.newLine();

        bw.write("||_/=\\\\__|");
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
*/