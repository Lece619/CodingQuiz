package basic_1;

import java.util.stream.Collectors;

public class ChangeL {
    public String solution(String myString) {
        return myString.chars().mapToObj(c ->{
            if(c < 'l'){
                return String.valueOf('l');
            }
            return String.valueOf((char)c);
        }).collect(Collectors.joining());
    }
}
