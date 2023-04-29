public class ongale1 {
    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        System.out.println(solution(babbling));
    }

    public static int solution(String[] babbling) {
        //"aya", "ye", "woo", "ma"

        int index = 0;

        for (String s : babbling) {
            for (int i = 0; index < s.length(); i++) {
                if (s.charAt(i) == 'a') {

                } else if (s.charAt(i)=='y') {

                } else if (s.charAt(i)=='w') {

                } else if (s.charAt(i) == 'm') {

                } else {
                    continue;
                }
            }
        }
        return 0;
    }
}
