package com.shvetsov.leetcode.shufflethearray1470;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    Solution solution;
    int[] case0;
    int[] case1;
    int[] case2;
    int[] case3;
    int nToCase0;
    int nToCase1;
    int nToCase2;
    int nToCase3;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        case0 = new int[]
                {1, 2, 3, 4, 5, 6};
        case1 = new int[]
                {2, 5, 1, 3, 4, 7};
        case2 = new int[]
                {1, 2, 3, 4, 4, 3, 2, 1};
        case3 = new int[]
                {1, 1, 2, 2};
        nToCase0 = 3;
        nToCase1 = 3;
        nToCase2 = 4;
        nToCase3 = 2;
    }

    @Test
    void shouldReturnModifiedArray() {
        //[x1,x2,x3,y1,y2,y3] -> [x1,y1,x2,y2,x3,y3], n = 3 - half of array (pivot)
        assertThat(solution.shuffle(case0, nToCase0)).containsExactly(1, 4, 2, 5, 3, 6);
        assertThat(solution.shuffle(case1, nToCase1)).containsExactly(2, 3, 5, 4, 1, 7);
        assertThat(solution.shuffle(case2, nToCase2)).containsExactly(1, 4, 2, 3, 3, 2, 4, 1);
        assertThat(solution.shuffle(case3, nToCase3)).containsExactly(1, 2, 1, 2);
    }
}
/*

{1, 1, 1, 2, 2, 2}
          3 (i - n) + 1
{1, 1, 1, 2, 2, 2}

{1, 2, 1, 2, 2, 2}


*/
