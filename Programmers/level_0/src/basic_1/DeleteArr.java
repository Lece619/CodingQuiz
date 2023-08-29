package basic_1;

import java.util.Arrays;

public class DeleteArr {
    public int[] solution(int[] arr, int[] delete_list) {
        return Arrays.stream(arr).filter(num -> Arrays.stream(delete_list).noneMatch(delete_num -> delete_num == num)).toArray();
    }
}
