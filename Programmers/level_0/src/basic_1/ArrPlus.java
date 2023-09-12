package basic_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrPlus {
    public int[] solution(int[] arr, int n) {
        IntStream.range(0, arr.length).filter(i -> i % 2 != arr.length % 2).forEach(i -> arr[i] += n);
        return arr;
    }
}
