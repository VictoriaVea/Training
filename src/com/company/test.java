package com.company;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Vea on 18.08.2015.
 */
public class test {
    public static void main(String[] args) {
        hello(Arrays.asList("Slughorn", "Norris", "Fred", "George"));
    }

    public static String hello(List<String> nameList) {
        return "Hello"+nameList;
    }
}
