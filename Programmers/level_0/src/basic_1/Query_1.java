package basic_1;

import java.util.stream.IntStream;

public class Query_1 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            answer[i] = IntStream.rangeClosed(query[0], query[1])
                    .map(num -> arr[num])
                    .filter(num -> num > query[2])
                    .sorted()
                    .findFirst()
                    .orElseGet(() -> -1);
        }
        return answer;
    }

}
