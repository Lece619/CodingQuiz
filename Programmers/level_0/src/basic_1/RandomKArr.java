package basic_1;

import java.util.Arrays;
import java.util.LinkedHashSet;

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
}
