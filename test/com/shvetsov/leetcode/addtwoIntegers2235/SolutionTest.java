package com.shvetsov.leetcode.addtwoIntegers2235;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void shouldReturnSumOfTwoInts() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        assertThat(solution.sum(1,3)).isEqualTo(4);
        assertThat(solution.sum(-2,2)).isEqualTo(0);
        assertThat(solution.sum(-2,4)).isEqualTo(2);
        assertThat(solution.sum(-2,-2)).isEqualTo(-4);

        //TODO replace this template from the test to a new class
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
    }
}