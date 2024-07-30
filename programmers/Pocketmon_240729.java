import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pocketmon_240729 {

    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2, 4};
        int result = solution(nums);
    }

    public static int solution(int[] nums) {
        int best = nums.length / 2;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[0] + 1, 1));
        }

        int size = map.keySet().size();

        if (size >= best) {
            return best;
        } else {
            return size;
        }
    }
}

/**
 * 다른 사람들 풀이 : HashSet은 중복된 요소를 없애준다.
 *
 * class Solution {
 *     public int solution(int[] nums) {
 *
 *             HashSet<Integer> hs = new HashSet<>();
 *
 *             for(int i =0; i<nums.length;i++) {
 *                 hs.add(nums[i]);
 *             }
 *
 *             if(hs.size()>nums.length/2)
 *                 return nums.length/2;
 *
 *             return hs.size();
 *     }
 * }
 */

/**
 * 리스트 이용
 *
 * import java.util.*;
 * class Solution {
 *     public int solution(int[] nums) {

 *         List<Integer> list = new ArrayList<Integer>();
 *         for(int i = 0 ; i < nums.length; i++){
 *             if(!list.contains(nums[i])){
 *                 list.add(nums[i]);
 *             }
 *         }
 *
 *         return nums.length/2 > list.size()?list.size():nums.length/2;
 *     }
 * }
 */