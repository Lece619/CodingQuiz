package test.basic_1;

import basic_1.Query_1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Query_1Test {

    @Test
    void solutionTest(){
        Query_1 query_1 = new Query_1();
        int[] arr = {1, 4, 7, 3, 2, 6};
        int[][] queries = {{2, 4, 5}, {4, 4, 5}, {1, 5, 3}};
        int[] expected = {7, -1, 4};
        int[] actual = query_1.solution(arr, queries);
        assertArrayEquals(expected, actual);
    }
}