import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
1. 테스트 케이스
2. 성적 입력
3. 평균 넘는 학생 비율 찾기
 */


public class BJ4344_MaybeAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcase = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < testcase; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];

            double sum = 0;

            //성적 입력 부분
            for (int j = 0; j < N; j++) {
                int val = Integer.parseInt(st.nextToken()); // 성적 저장
                arr[j] = val;
                sum += val; // 성적 누적 합
            }

            double mean = (sum / N);
            double count = 0;

            // 평균 넘는 학생 비율 찾기
            for (int j = 0; j < N; j++) {
                if (arr[j] > mean) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/N)*100);
        }
    }
}

/*
public class BJ4344_MaybeAverage {
    public static void main(String[] args) throws IOException {


            주의할 점
            1. 출력은 소수점 셋째자리까지 출력한다.
            2. 각 테스트 케이스의 첫 번째 수는 해당 케이스의 입력 개수다.
            3. 평균을 넘기는 학생의 비율을 %로 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {

            double sum = 0;
            double avg = 0;
            double cnt = 0;
            double res = 0;

            String[] str = br.readLine().split(" ");

            for (int j = 1; j <= str.length-1; j++) {
                sum = sum + Double.parseDouble(str[j]);
            }
            avg = sum / Double.parseDouble(str[0]);


            for (int k = 1; k <= str.length-1; k++) {
                if (Double.parseDouble(str[k]) > avg) {
                    cnt++;
                }
            }
            res =(cnt / Double.parseDouble(str[0])) * 100;
            sb.append(String.format("%.3f", res)).append("%").append("\n");
        }
        System.out.println(sb);
    }

 */