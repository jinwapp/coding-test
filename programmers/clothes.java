import java.util.HashMap;

public class clothes {
    public static void main(String[] args) {

        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(solution(clothes));

    }

    public static int solution(String[][] clothes) {

        HashMap<String, Integer> hp = new HashMap();

        for (String[] cloth : clothes) {
            hp.put(cloth[1], hp.getOrDefault(cloth[1], 0) + 1);
        }

        return 1;
    }
}
