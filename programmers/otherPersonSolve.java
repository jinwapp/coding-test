import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class otherPersonSolve {
    public static void main(String[] args) throws IOException {
        String[] participant = {"leo", "kiki", "eden"}; // 입력 1
        String[] completion = {"eden", "kiki"}; // 입력 2


        System.out.println(solution(participant,completion));

    }

    public static String solution(String[] participant, String[] completion) {
        /**
         * 정확성 58.3 / 효율성: 41.7
         */
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }
}




/**
 * getOrDefault = 찾는 키가 존재한다면 찾는키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
 * 사용법 : getOrDefault(Object key, V DefaultValue)   key값, 기본값
 * get(key) = Hashmap의 value 값
 * keySet() = Hahshmap의 key만 모두 조회
 */

/**
 * class Solution {
 *     public String solution(String[] participant, String[] completion) {
 *         Arrays.sort(participant);
 *         Arrays.sort(completion);
 *
 *         int i = 0;
 *
 *         for ( i = 0; i < completion.length; i++) {
 *
 *             if (!participant[i].equals(completion[i])) {
 *                 return participant[i];
 *             }
 *         }
 *         return participant[participant.length - 1];
 *     }
 * }
 */