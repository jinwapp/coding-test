import java.util.HashMap;

public class PG_Pocketmon {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};

    }

    public int solution(int[] nums) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        int res = 0;
        for (int key : nums) {
            hp.put(key, hp.getOrDefault(key, 0) + 1);
        }
        for (Integer i : hp.keySet()) {
            if (hp.get(i) != 0) {

            }
        }
    }
}
