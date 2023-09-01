package basic_1;

import java.util.stream.IntStream;

public class IntStreamTraining {
    public int[] solution(int start, int end_num) {
        return IntStream.rangeClosed(0, start - end_num).map(num -> start - num).toArray();
    }
}
