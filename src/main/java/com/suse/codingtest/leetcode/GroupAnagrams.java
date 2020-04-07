package com.suse.codingtest.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings, group anagrams together.
 *
 *     Example:
 *
 *     Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 *     Output:
 *     [
 *     ["ate","eat","tea"],
 *     ["nat","tan"],
 *     ["bat"]
 *     ]
 *     Note:
 *
 *     All inputs will be in lowercase.
 *     The order of your output does not matter.
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> anagrams = groupAnagrams(strs);
        System.out.println(anagrams);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        int length = strs.length;
        Map<String, List<String>> map = new HashMap();

        for (int i = 0; i < length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            String value = new String(strs[i]);

            if (map.containsKey(key)) {
                map.get(key).add(value);
            } else {
                List<String> values = new ArrayList();
                values.add(value);
                map.put(new String(chars), values);
            }

        }
        List<List<String>> listsOfLists = new ArrayList();

        for (String s : map.keySet()) {
            listsOfLists.add(map.get(s));
        }
        return listsOfLists;
    }
}
