import java.util.HashSet;

/**
 * Hash로 다시 풀기
 */
public class RE_PhoneNumberList_240804 {

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};

        Boolean result = solution(phone_book);
        System.out.println("result = " + result);
    }

    public static boolean solution(String[] phone_book) {
        HashSet<String> hs = new HashSet<>();
        Boolean answer = true;

        for (String key : phone_book) {
            hs.add(key);
        }

        System.out.println("hashset = " + hs);

        for (String phone : phone_book) {
            System.out.println("phone = " + phone);
            for (int i = 1; i < phone.length(); i++) {
                if (hs.contains(phone.substring(0, i))) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}

/** 내꺼 답안
 *     public static Boolean solution(String[] phone_book) {
 *         Arrays.sort(phone_book);
 *
 *         Boolean answer = true;
 *
 *         for (int i = 0; i < phone_book.length-1; i++) {
 *             if (phone_book[i + 1].startsWith(phone_book[i])) {
 *                 answer = false;
 *                 break;
 *             }
 *         }
 *         return answer;
 *     }
 */
