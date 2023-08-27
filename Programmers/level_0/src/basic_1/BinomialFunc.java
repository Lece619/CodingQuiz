package basic_1;



public class BinomialFunc {
    public int solution(String binomial) {
        String[] split = binomial.split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[2]);
        return switch (split[1]) {
            case "+" -> n + m;
            case "-" -> n - m;
            case "*" -> n * m;
            default -> throw new IllegalArgumentException("Unexpected value: " + split[1]);
        };
    }
}
