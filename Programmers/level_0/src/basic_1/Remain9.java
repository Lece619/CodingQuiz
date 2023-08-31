package basic_1;

public class Remain9 {
    public int solution(String number) {
//        return number.chars().map(Character::getNumericValue).sum() % 9;
//        return number.chars().map(c -> c - '0').sum() % 9;
        return number.chars().mapToObj(c -> String.valueOf((char)c)).mapToInt(Integer::parseInt).sum() % 9;
    }


}
