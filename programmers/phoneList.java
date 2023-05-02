import java.util.HashMap;
import java.util.HashSet;

public class phoneList {
    public static void main(String[] args) {

        String[] phone_book = {"12","123","1235","567","88"};

        System.out.println(solution(phone_book));

    }

    public static boolean solution(String[] phone_book) {

        HashSet<String> hs = new HashSet<>();

        for (String key : phone_book) {
            hs.add(key);
        }

        for (String phone : phone_book) {
            for (int j = 1; j < phone.length(); j++) {
                if (hs.contains(phone.substring(0, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}


//입출력 예제
//phone_book
//["119", "97674223", "1195524421"]	false
//["123","456","789"]	            true
//["12","123","1235","567","88"]	false