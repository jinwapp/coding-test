import java.util.Arrays;
import java.util.LinkedList;

public class K {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},
                            {4, 4, 1},
                            {1, 7, 3}};

        System.out.println(solution(array,commands));
    }

    public static LinkedList<Integer> solution(int[] array, int[][] commands) {

        int[] temp = new int[10];
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < commands.length; i++) {
            int startIndex = commands[i][0];
            int endIndex = commands[i][1];
            int selectIndex = commands[i][2];

            System.out.println("startIndex : " + startIndex + " endIndex : " + endIndex + " selectIndex : " + selectIndex);

            temp = Arrays.copyOfRange(array, startIndex-1, endIndex);

            System.out.println(Arrays.toString(temp));
            Arrays.sort(temp);
            System.out.println(Arrays.toString(temp));

            list.add(temp[selectIndex-1]);

        }

        return list;
    }
}

/**
 * 1. command[0] ~ command[1]
 * 2. 내림차순
 * 3. command[2] => array 조회 => 배열에 추가
 */