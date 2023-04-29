import java.util.HashMap;

public class pocketmon {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2,2,2};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        int count = nums.length/2;
        int res = 0;
        for (int key : nums) {
            hp.put(key, hp.getOrDefault(key, 0) + 1);
        }
        for (Integer i : hp.keySet()) {
            if (res == count) {
                break;
            } else res++;
        }
        return res;
    }
}
