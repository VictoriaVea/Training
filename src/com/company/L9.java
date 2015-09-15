package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L9 {

    @Test
    public void test1() {
        Assert.assertEquals(20, 10 + 10);
        Assert.assertEquals(true, 1 == 1);
        Assert.assertTrue(1 == 1);
    }

    @Test
    public void test2() {
        Assert.assertEquals("Hello Engineers!", hello());
        // Test PASSED.
        Assert.assertEquals("Hello Friends", hello("Friends"));
        // Test PASSED.
        Assert.assertEquals("Hello Good Men", hello("Good Men"));
        // Test PASSED.
        Assert.assertEquals("Hello to all 14 students!", hello(14));
        // Test PASSED.
        Assert.assertEquals("Hello student!", hello(1));
        // Test PASSED.
        Assert.assertEquals("No one came.", hello(0));
        // Test PASSED.
        Assert.assertEquals("Hello to all 25 persons!", hello(25, "persons"));
        // Test PASSED.
        Assert.assertEquals("Hello to all 99 programmers!", hello(99, "programmers"));
        // Test PASSED.
        Assert.assertEquals("Hello Jean Podmore Oleksiia !", hello(new String[]{"Jean", "Podmore", "Oleksiia"}));
        // Test PASSED.
        Assert.assertEquals("Hello Anonymous Anonymous2 !", hello(new String[]{"Anonymous", "Anonymous2"}));
        // Test PASSED.
        Assert.assertEquals("Hello Slughorn, Norris, Fred and George!", hello(Arrays.asList("Slughorn", "Norris", "Fred", "George")));
        // Test PASSED.
        Assert.assertEquals("Hello Horace, Miss and Weasley's!", hello(Arrays.asList("Horace", "Miss", "Weasley's")));
        // Test PASSED.
        Assert.assertEquals(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
        // Test PASSED.
    }

    @Test
    public void test3() {
        Assert.assertEquals(Arrays.asList(1, 4, 3), Arrays.asList(1, 2, 3));
        // Test FAILED.
    }

    @Test
    public void test4() {
        Assert.assertEquals(Arrays.asList(6), stringsLength(Arrays.asList("Jordan")));
        // Test PASSED.
        Assert.assertEquals(Arrays.asList(5, 3, 8), stringsLength(Arrays.asList("Harry", "Ron", "Hermione")));
        // Test PASSED.
        Assert.assertEquals("[5, 5]", stringsLength(Arrays.asList("Jinny", "Lupin")).toString());
        // Test PASSED.
        Assert.assertEquals(Arrays.asList(3, 6, 1, -60), reverseInts(Arrays.asList(-60, 1, 6, 3)));
        // Test PASSED.
        prettyPrint(Arrays.asList("Vernon", "Dudley", "Petunia", "Madge"), true);

        prettyPrint(reverse(Arrays.asList("Vernon", "Dudley", "Petunia", "Madge")), false);

    }


    public static void sayHello() {
        System.out.println("Hello Class!");
    }

    public static String hello() {
        return "Hello Engineers!";
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

    public static String hello(List<String> nameList) {
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

    @Test
    public void testPass(){
        Assert.assertEquals(10,sumAll(new int[] {1,4,2,3,0}));
        Assert.assertEquals(11,sumAll(new int[] {1,4,2,3,1}));
        Assert.assertEquals(12,sumAll(new int[] {2,4,2,3,1}));
        Assert.assertEquals(13,sumAll(new int[] {2,5,2,3,1}));
        Assert.assertEquals(14,sumAll(new int[] {2,5,3,3,1}));
        Assert.assertEquals(15,sumAll(new int[] {2,5,3,4,1}));
        Assert.assertEquals(16,sumAll(new int[] {2,5,3,4,2}));
        Assert.assertEquals(17,sumAll(new int[] {3,5,3,4,2}));
    }
    @Test
    public void testFail(){
        Assert.assertEquals(38,sumAll(new int[] {1,41,2}));
        Assert.assertEquals(38,sumAll(new int[] {1,37,2}));
    }

    public static int sumAll(int[] a) {
        int res=0;
        for (int x:a){
            res+=x;
        }
        return res;
    }
}
