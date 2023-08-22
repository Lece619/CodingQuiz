package test.basic_1;

import basic_1.ChangeL;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeITest {

    @Test
    void solution() {
        ChangeL changeI = new ChangeL();
        String myString = "abcdk";
        String expected = "iiiik";
        String actual = changeI.solution(myString);
        assertEquals(expected, actual);
    }
}