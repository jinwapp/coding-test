import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonFinisher_240729 {

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana","ana"};
        String[] complete = {"stanko", "ana", "mislav"};

        String result = solution(participant, complete);
        System.out.println("result = " + result);
    }

    /**
     * 모범 답안 2
     */
    public static String solution(String[] participant, String[] complete) {

        Map<String, Long> partcipantMap = Arrays.asList(participant).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(partcipantMap);

        for (String player : complete) {

            Long value = partcipantMap.get(player) - 1L;

            if (value == 0) {
                partcipantMap.remove(player);
            } else {
                partcipantMap.put(player, value);
            }
        }
        return partcipantMap.keySet().stream().iterator().next();
    }
}

/** 나의 풀이
 *    public static String solution(String[] participant, String[] complete) {
 *
 *         List<String> partcipantList = Arrays.asList(participant);
 *         List<String> completeList = Arrays.asList(complete);
 *
 *         String result = "";
 *
 *         HashMap<String, Integer> partcipantCount = new HashMap<>();
 *
 *         for (String s : partcipantList) {
 *             partcipantCount.put(s, partcipantCount.getOrDefault(s, 0) + 1);
 *         }
 *
 *         for (String s : completeList) {
 *             partcipantCount.put(s, partcipantCount.get(s) - 1);
 *         }
 *
 *         for (String s : partcipantCount.keySet()) {
 *             if (partcipantCount.get(s).equals(1)) {
 *                 result = s;
 *             }
 *         }
 *         return result;
 *     }
 */

/** 모범 답안 1
 *     public static String solution(String[] participant, String[] complete) {
 *         String answer = "";
 *         HashMap<String, Integer> hm = new HashMap<>();
 *
 *         for (String player : participant)  hm.put(player, hm.getOrDefault(player, 0) + 1);
 *         for (String player : complete)  hm.put(player, hm.getOrDefault(player, 0) - 1);
 *
 *         for (String player : hm.keySet()) {
 *             if (!hm.get(player).equals(0)) {
 *                 answer = player;
 *             }
 *         }
 *         return answer;
 *     }
 */
