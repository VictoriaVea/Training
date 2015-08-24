package com.company;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by Vea on 14.08.2015.
 */
public class Home6_2 {
    public static void main(String[] args) {
        sayHello();
        // Hello Class!
        System.out.println(hello());
        // Hello Engineers!
        System.out.println(hello("Friends"));
        // Hello Friends
        System.out.println(hello("Friends").equals(hello("Friends")));
        // true
        System.out.println(hello("Friends") == hello("Friends"));
        // false
        test("Hello Engineers!", hello());
        // Test PASSED.
        test("Hello Enginers!", hello());
        // Test FAILED.
        // Expected: Hello Engineers!
        // Actual:   Hello Enginers!
        test("Hello Friends", hello("Friends"));
        // Test PASSED.
        test("Hello Good Men", hello("Good Men"));
        // Test PASSED.
        test("Hello to all 14 students!", hello(14));
        // Test PASSED.
        System.out.println("\n");
        test("Hello student!", hello(1));
        // Test PASSED.
        test("No one came.", hello(0));
        // Test PASSED.
        test("Hello to all 25 persons!", hello(25, "persons"));
        // Test PASSED.
        System.out.println("\n");
        test("Hello to all 99 programmers!", hello(99, "programmers"));
        // Test PASSED.
        test("Hello Jean Podmore Oleksiia !", hello(new String[]{"Jean", "Podmore", "Oleksiia"}));
        // Test PASSED.
        test("Hello Anonymous Anonymous2 !", hello(new String[] {"Anonymous", "Anonymous2"}));
        // Test PASSED.
        System.out.println("\n");
        test("Hello Slughorn, Norris, Fred and George!", hello(Arrays.asList("Slughorn", "Norris", "Fred", "George")));
        // Test PASSED.
        test("Hello Horace, Miss and Weasley's!", hello(Arrays.asList("Horace", "Miss", "Weasley's")));
        // Test PASSED.
        test(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
        // Test PASSED.
        System.out.println("\n");
        test(Arrays.asList(1, 4, 3), Arrays.asList(1, 2, 3));
        // Test FAILED.
        // Expected: [1, 4, 3]
        // Actual:   [1, 2, 3]

        test(Arrays.asList(6), stringsLength(Arrays.asList("Jordan")));
        // Test PASSED.
        test(Arrays.asList(5, 3, 8), stringsLength(Arrays.asList("Harry", "Ron", "Hermione")));
        // Test PASSED.
        test("[5, 5]", stringsLength(Arrays.asList("Jinny", "Lupin")).toString());
        // Test PASSED.
        test(Arrays.asList(3, 6, 1, -60), reverseInts(Arrays.asList(-60, 1, 6, 3)));
        // Test PASSED.
        prettyPrint(Arrays.asList("Vernon", "Dudley", "Petunia", "Madge"), true);
        // Vernon
        //  Dudley
        //   Petunia
        //    Madge
        prettyPrint(reverse(Arrays.asList("Vernon", "Dudley", "Petunia", "Madge")), false);
        //    Madge
        //   Petunia
        //  Dudley
        // Vernon
    }

    public static void sayHello() {
        System.out.println("Hello Class!");
    }

    public static String hello() {
        return "Hello Engineers!";
    }

    public static void test(String actual, String expected) {
        if (expected.equals(actual)) {
            System.out.println("Test PASSED.");
        }else {
            System.out.println("Test FAILED." + "\n" + "Expected: " + expected + "\n" + "Actual:   " + actual);
        }
    }

    public static String hello(String who) {
        return "Hello "+who;
     }

    public static String hello(int howMany) {
        if (howMany==0) {
            return "No one came.";
        }else {
            if (howMany == 1) {
                return "Hello student!";
            } else {
                return "Hello to all " + howMany + " students!";
            }
        }
    }

    public static String hello (String[] listed) {
        String Output = "Hello ";
        for (String i : listed) {
            Output += i + " ";
        }
        return Output+ "!";
    }

    public static String hello(int howMany, String whom) {
        return "Hello to all "+howMany+" "+whom+"!";
    }

    public static String hello(List <String> nameList) {
        String nameset="Hello ";
        for (int i=0;i<nameList.size();i++){
            if (i==nameList.size()-2){
                nameset+=nameList.get(i)+" and "+nameList.get(i+1)+"!";
                break;
            }
            nameset+=nameList.get(i)+", ";
        }
        return nameset;
    }

    public static void test(List <Integer> L1, List <Integer> L2) {
        boolean res=true;
        if (L1.size() != L2.size()) {
            res=false;
        } else {
            if (L1.size() == 0) {
                res=true;
            } else {
                for (int i = 0; i < L1.size(); i++) {
                    if (L1.get(i)==L2.get(i)) {
                        res=true;
                    } else {
                        res=false;
                        break;
                    }
                }
            }
        }
        if (res){
            System.out.println("Test PASSED.");
        }else {
            System.out.println("Test FAILED." + "\n" + "Expected: " + L1 + "\n" + "Actual:   " + L2);
        }
    }

    public static List<Integer> stringsLength(List <String> NameFull) {
        ArrayList<Integer> output = new ArrayList<>();
        for (String Word:NameFull){
            output.add(Word.length());
        }
        return output;
    }

    public static void prettyPrint (List<String> NameSet, boolean way){
        int space=0;
        int spacemax = NameSet.size()-1;
        if (way){
            for (String n:NameSet) {
                System.out.println(repeat(" ",space)+n);
                space++;
            }
        }else{
            for (String n:NameSet) {
                System.out.println(repeat(" ",spacemax)+n);
                spacemax--;
            }
        }
    }

    public static String repeat (String s,int num){
        String res="";
        for (int i=0;i<num;i++){
            res+=s;
        }
        return res;
    }

    public static List<String> reverse(List <String> NameSet){
        ArrayList <String> set=new ArrayList<>();
        for (int i=NameSet.size()-1;i>=0;i--){
            set.add(NameSet.get(i));
        }
        return set;
    }

    public static List<Integer> reverseInts(List <Integer> row){
        ArrayList <Integer> set=new ArrayList<>();
        for (int i=row.size()-1;i>=0;i--){
            set.add(row.get(i));
        }
        return set;
    }

}


