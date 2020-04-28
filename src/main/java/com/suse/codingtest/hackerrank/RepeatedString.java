package com.suse.codingtest.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatedString {

    public static void main(String[] args) {

        repeatedString("abcab",13);
    }

    static long repeatedString(String s, long n) {
        List<String> split = Arrays.asList(s.split(""));
        List<String> resultString = new ArrayList<>();

        for(int i =0; i< n; i++){
            for(int j=0; j< split.size(); j++){
                resultString.add(split.get(j));
                i++;
            }
        }

        System.out.println(resultString);
        return 0;
    }
}
