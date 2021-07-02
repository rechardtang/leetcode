package com.cn.leetcode;

/**
 * 205. 同构字符串
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 * <p>
 * 如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。
 * <p>
 * 每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入：s = "egg", t = "add"
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：s = "foo", t = "bar"
 * 输出：false
 * 示例 3：
 * <p>
 * 输入：s = "paper", t = "title"
 * 输出：true
 * <p>
 * <p>
 * 提示：
 * <p>
 * 可以假设 s 和 t 长度相同。
 */
public class A0205_isIsomorphic {

    public boolean isIsomorphic(String s, String t) {
        char[] map_s = new char[256];
        char[] map_t = new char[256];
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            char mc = map_s[sc];
            char nc = map_t[tc];
            if (mc == 0){
                map_s[sc] = tc;
                mc = tc;
            }
            if (mc != tc) return false;

            if (nc == 0){
                map_t[tc] = sc;
                nc = sc;
            }
            if (nc != sc) return false;
        }
        return true;
    }

}
