package basic_1;

import java.util.Map;
import java.util.function.BiFunction;

public class ConditionQuery {
    public int solution(String ineq, String eq, int n, int m) {
        if(eq.equals("=")){
            if(ineq.equals(">")){
                return n >= m ? 1 : 0;
            }
            return n <= m ? 1 : 0;
        }
        if(ineq.equals(">")){
            return n > m ? 1 : 0;
        }
        return n < m ? 1 : 0;
    }

    public int solutionBiFunction(String ineq, String eq, int n, int m) {
        Map<String, BiFunction<Integer, Integer, Integer>> functions = Map.of(
                ">!", (a, b) -> a > b ? 1 : 0,
                "<!", (a, b) -> a < b ? 1 : 0,
                ">=", (a, b) -> a >= b ? 1 : 0,
                "<=", (a, b) -> a <= b ? 1 : 0
        );
        return functions.get(ineq + eq).apply(n, m);
    }
}
