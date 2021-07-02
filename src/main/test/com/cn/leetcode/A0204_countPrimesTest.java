package com.cn.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class A0204_countPrimesTest {

    private A0204_countPrimes client;

    @Before
    public void setUp() throws Exception {
        client = new A0204_countPrimes();
    }

    @Test
    public void countPrimes() {
        assertEquals(4, client.countPrimes(10));
        assertEquals(0, client.countPrimes(0));
        assertEquals(0, client.countPrimes(1));
    }

    @Test
    public void isPrime() {
        assertFalse(client.isPrime(0));
        assertFalse(client.isPrime(1));
        assertTrue(client.isPrime(2));
        assertTrue(client.isPrime(3));
        assertTrue(client.isPrime(5));
        assertTrue(client.isPrime(7));
        assertFalse(client.isPrime(4));
    }
}