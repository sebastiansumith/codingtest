package com.suse.codingtest.leetcode;

import java.util.ArrayList;
import java.util.List;


/**
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 *
 * Example 1:
 *
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 * Example 2:
 *
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 * Example 3:
 *
 * Input: S = "a##c", T = "#a#c"
 * Output: true
 * Explanation: Both S and T become "c".
 * Example 4:
 *
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 * Note:
 *
 * 1 <= S.length <= 200
 * 1 <= T.length <= 200
 * S and T only contain lowercase letters and '#' characters.
 * Follow up:
 *
 * Can you solve it in O(N) time and O(1) space?
 */
public class BackSpaceStringCompare {

    public static void main(String[] args) {
        String s1 = "ab##";
        String s2 = "ad#c";
        System.out.println(backspaceCompare(s1, s2));
    }

    public static boolean backspaceCompare(String S, String T) {

        return getEffectiveString(S).equals(getEffectiveString(T));
    }

    private static String getEffectiveString(String s) {
        List<String> list = new ArrayList();
        String[] split = s.split("");
        for(int i=0; i<split.length; i++){
            String s1 = split[i];
            if(s1.equals("#")){
               if(list.size()>0){
                   list.remove(list.size()-1);
               }

            }else{
                list.add(s1);
            }

        }
        return getStringFromList(list);
    }

    private static String getStringFromList(List<String> list) {
        final StringBuilder builder = new StringBuilder("");
        list.forEach( l->{
            builder.append(l);
        });
        return builder.toString();
    }
}
