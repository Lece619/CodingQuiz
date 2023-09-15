package basic_1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.IntStream;

public class RandomKArr {
    public int[] solution(int[] arr, int k) {
        LinkedHashSet<Integer> nums = new LinkedHashSet<>();
        Arrays.stream(arr).boxed().forEach(nums::add);
        int[] array = nums.stream().mapToInt(i -> i).toArray();
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        System.arraycopy(array, 0, answer, 0, Math.min(k, array.length));

        return answer;
    }
    public int[] solution2(int[] arr, int k) {
        return IntStream.concat(Arrays.stream(arr).distinct(), IntStream.range(0, k).map(i -> -1)).limit(k).toArray();
    }
}
