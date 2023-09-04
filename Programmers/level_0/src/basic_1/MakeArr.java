package basic_1;

import java.util.Stack;
import java.util.stream.IntStream;

public class MakeArr {
    public int[] solution(int[] arr, boolean[] flag) {

        Stack<Integer> result = new Stack<>();

        IntStream.range(0, arr.length).forEach(
                i -> {
                    if (flag[i])
                        IntStream.range(0, arr[i] * 2).forEach(item -> result.push(arr[i]));
                    else
                        IntStream.range(0, arr[i]).forEach(j -> result.pop());

                }
        );

        return result.stream().mapToInt(i -> i).toArray();
    }
}
