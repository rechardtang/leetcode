package com.example.string;

public class RomanToInt {

    public int romanToInt(String s) {
        if (s.length() == 1) {
            return value(s.charAt(0));
        }
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            int v = value(c1);
            if (i + 1 < s.length()) {
                char c2 = s.charAt(i + 1);
                if (c1 == 'I' && c2 == 'V') {
                    num += value('V') - 1;
                    i++;
                } else if (c1 == 'I' && c2 == 'X') {
                    num += value('X') - 1;
                    i++;
                } else if (c1 == 'X' && c2 == 'L') {
                    num += value('L') - 10;
                    i++;
                } else if (c1 == 'X' && c2 == 'C') {
                    num += value('C') - 10;
                    i++;
                } else if (c1 == 'C' && c2 == 'D') {
                    num += value('D') - 100;
                    i++;
                } else if (c1 == 'C' && c2 == 'M') {
                    num += value('M') - 100;
                    i++;
                } else {
                    num += v;
                }
            } else {
                num += v;
            }

        }
        return num;
    }

    private int value(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

    public static void main(String[] args) {
        RomanToInt roman = new RomanToInt();
        System.out.println(roman.romanToInt("XLIX"));
    }
}
