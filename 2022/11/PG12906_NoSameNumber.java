import java.io.IOException;
import java.util.Arrays;

public class PG12906_NoSameNumber {
    public static void main(String[] args) throws IOException {
        String[] partcipant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        PG12906_NoSameNumber pg42576_athelete = new PG12906_NoSameNumber();
        pg42576_athelete.solution(partcipant, completion);
    }

    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {

            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[participant.length - 1];
    }
}

/* HashMap을 이용하여 문제풀이
public class PG42576_Athelete {
    public static void main(String[] args) throws IOException {
        String[] partcipant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        PG42576_Athelete pg42576_athelete = new PG42576_Athelete();
        pg42576_athelete.solution(partcipant, completion);
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> hp = new HashMap<>();

        for (String key : participant) {
            hp.put(key, hp.getOrDefault(key,0) + 1);
        }
        for (String key : completion) {
            hp.put(key, hp.getOrDefault(key, 10) - 1);
        }
        for (String key : hp.keySet()) {
            if (hp.get(key) != 0) {
                answer = key;
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }
}

 */