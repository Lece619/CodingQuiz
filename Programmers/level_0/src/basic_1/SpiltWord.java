package basic_1;

public class SpiltWord {
    public String[] solution(String myStr) {
//        String filteredStr = myStr.replaceAll("[abc]", " ").replaceAll(" +"," ").trim();
//        return filteredStr.length() == 0 ? new String[]{"EMPTY"} : filteredStr.split(" ");
//
        String str = myStr.replaceAll("[abc]+", " ").trim();
        return  str.length() == 0 ? new String[]{"EMPTY"} : str.split(" ");
    }
}
