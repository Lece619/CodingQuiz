package basic_2;

import java.util.Arrays;

public class CreateArr3 {
    public int[] solution(int[] arr, int[][] intervals) {
//        return Arrays.stream(intervals).map(interval -> Arrays.copyOfRange(arr, interval[0], interval[1] + 1))
//                .reduce((a, b) -> {
//                    int[] result = new int[a.length + b.length];
//                    System.arraycopy(a, 0, result, 0, a.length);
//                    System.arraycopy(b, 0, result, a.length, b.length);
//                    return result;
//                }).orElse(new int[0]);
        return Arrays.stream(intervals).flatMapToInt(ints -> Arrays.stream(Arrays.copyOfRange(arr, ints[0], ints[1] + 1))).toArray();
    }
}
