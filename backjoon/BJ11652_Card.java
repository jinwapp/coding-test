import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
HashMap 개념에 대한 문제이다.
    기본 : put("a", "A") / get("a")
    boolean 1. containsKey() : key가 포함되어 있는지 여부를 반환한다.
    boolean 2. containsValue() : value가 포함되어 있는지 여부를 반환한다.
    Set 3. entrySet() : key=value 을 엔트리의 형태로 Set에 저장하여 반환한다.
    Set 4. keySet() : key를 Set에 저장하여 반환한다.
    Set 5. values() : value를 Set에 저장하여 반환한다.
    6. clear() : key, value를 제거한다.
    Object 7. remove(Object key) key에 해당하는 value를 제거한다.
    8. getOrDefault(Object key, Object defaultValue) : key의 value를 반환한다. 키가 없을 경우, defaultValue로 지정된 값을 반환한다.
    9. replace(Object key, Obeject value) : key의 value을 매개변수의 value로 교체한다.
 */

public class BJ11652_Card {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Map<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            Long key = Long.parseLong(br.readLine());
            if (map.containsKey(key)) {
                map.put(key, map.getOrDefault(key, 0) + 1);
            } else {
                map.put(key, 1);
            }
        }

        int max = 0;

        for (Integer val : map.values()) {
            if (val > max) {
                max = val;
            }
        }

        PriorityQueue<Long> q = new PriorityQueue<>();
        for (Long key : map.keySet()) {
            if (max == map.get(key)) {
                q.add(key);
            }
        }
        System.out.println(q.poll());

        // N을 입력 받는다.
        // 반복문을 돌면서 정수를 입력한다.
        // if hashmap이 key를 포함하면
        // getofdefault로 value로 가져와서 +1
        // else put +1 한다.

    }
}