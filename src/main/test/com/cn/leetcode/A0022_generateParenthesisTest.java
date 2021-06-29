package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class A0022_generateParenthesisTest {
    private A0022_generateParenthesis client;

    @Before
    public void setUp() throws Exception {
        client = new A0022_generateParenthesis();
    }

    @Test
    public void generateParenthesis() {
        assertEquals(Collections.singletonList("()"), client.generateParenthesis(1));

        List<String> expected = new ArrayList<>();
        expected.add("((()))");
        expected.add("(()())");
        expected.add("(())()");
        expected.add("()(())");
        expected.add("()()()");
        assertEquals(expected, client.generateParenthesis(3));
    }
}