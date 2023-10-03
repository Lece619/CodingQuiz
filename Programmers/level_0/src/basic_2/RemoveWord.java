package basic_2;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveWord {
    public String solution(String my_string, int[] indices) {
        return IntStream.range(0, my_string.length()).filter(i -> IntStream.of(indices).noneMatch(j -> j == i))
                .mapToObj(n -> String.valueOf(my_string.charAt(n))).collect(Collectors.joining());
    }
}
