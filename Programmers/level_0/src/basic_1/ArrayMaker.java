package basic_1;

import java.util.Arrays;

public class ArrayMaker {
    public int[] solution(int[] arr, int k) {
        return switch (k % 2) {
            case 0 -> Arrays.stream(arr).map(num -> num + k).toArray();
            default -> Arrays.stream(arr).map(num -> num * k).toArray();
        };
    }
}
