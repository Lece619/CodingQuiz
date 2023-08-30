package basic_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RightOrLeft {
    public String[] solution(String[] str_list) {
        int order = IntStream.range(0, str_list.length).filter(i -> str_list[i].equals("r") || str_list[i].equals("l"))
                .findFirst().orElseGet(() -> -1);
        if (order == -1) {
            return new String[]{};
        }
        if(str_list[order].equals("r"))
            return Arrays.stream(str_list, order + 1, str_list.length).toArray(String[]::new);

        return Arrays.stream(str_list, 0, order).toArray(String[]::new);
    }
}
