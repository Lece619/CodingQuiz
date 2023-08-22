package test.basic_1;

import basic_1.ChangeL;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeLTest {

    @Test
    void solution() {
        ChangeL changeI = new ChangeL();
        String myString = "abcdkm";
        String expected = "lllllm";
        String actual = changeI.solution(myString);
        assertEquals(expected, actual);
    }
}