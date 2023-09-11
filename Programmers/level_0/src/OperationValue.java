public class OperationValue {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return operationTwo(operationOne(x1, x2), operationOne(x3, x4)) ;
    }

    //"V"  (OR)
    boolean operationOne(boolean one, boolean two) {
        return one || two;
    }

    //"∧" (AND)
    boolean operationTwo(boolean one, boolean two) {
        return one && two;
    }
}
