package com.example.string;

public class ZConvert {

    public String convert(String s, int numRows) {
        int step = 2 * (numRows - 1);
        step = step <= 0 ? 1 : step;
        StringBuilder all = new StringBuilder();
        for (int row = 0; row < numRows; row++) {
            StringBuilder sb = new StringBuilder();
            int curStep = step - 2 * row;
            curStep = curStep == 0 ? step : curStep;
            int i = row, j = i + curStep;
            while (i < s.length()) {
                sb.append(s.charAt(i));
                if (j < s.length()) {
                    sb.append(s.charAt(j));
                }
                i += step;
                if (i == j) {
                    i += step;
                }
                j = i + curStep;
            }
            all.append(sb);
        }
        return all.toString();
    }


    public static void main(String[] args) {
        ZConvert converter = new ZConvert();
        System.out.println("A".equals(converter.convert("A", 1)));
        System.out.println("PAHNAPLSIIGYIR".equals(converter.convert("PAYPALISHIRING", 3)));
        System.out.println("PINALSIGYAHRPI".equals(converter.convert("PAYPALISHIRING", 4)));
        System.out.println(converter.convert("PAYPALISHIRING", 4));
    }
}
