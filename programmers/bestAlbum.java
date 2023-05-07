import java.util.HashMap;

public class bestAlbum {
    public static void main(String[] args) {

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println(solution(genres, plays));

        //[4, 1, 3, 0]
    }

    public static int solution(String[] genres, int[] plays) {

        HashMap<String, Integer> hp = new HashMap<>();
        int[] sort = new int[100000000];

        for (int i = 0; i < genres.length; i++) {
            hp.put(genres[i], hp.getOrDefault(genres[i],0)+plays[i]);
        }

        for (int value : hp.values()) {



        }

    }
}
