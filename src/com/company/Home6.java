package com.company;

import java.util.ArrayList;

/**
 * Created by Vea on 10.08.2015.
 */
public class Home6 {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        print(s);
        //a
        //b
        //c
        //d
        ArrayList<String> f = new ArrayList<>();
        f.add("a");
        f.add("b");
        f.add("c");
        f.add("d");
        System.out.println(isListsEqual(s, f));
        //true
        f.add("d");
        System.out.println(isListsEqual(s, f));
        //false
        s.add("b");
        System.out.println(isListsEqual(s, f));
        //false
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        System.out.println(s1.size());
        System.out.println(s2.size());
        System.out.println(isListsEqual(s1, s2));
        //true
        String[] a = {"a", "b", "c", "d", "b"};
        print(a);
        //abcdb
        System.out.println(isEqual(a, s));
        //true
    }
    public static void print(ArrayList<String> l) {
        for (String i:l) {
            System.out.println(i);
        }
    }

    public static void print(String[] a) {
        for (String j:a){
            System.out.print(j);
        }
        System.out.println();
    }

    public static boolean isListsEqual(ArrayList<String> s,ArrayList<String> f){
        boolean output=false;
        if (s.size()==f.size()) {
            for (int i = 0; i < s.size(); i++) {
                if (s.get(i).equals(f.get(i))) {
                    output = true;
                } else {
                    output = false;
                }
            }
        }
        else {
            output=false;
        }
        return output;
    }

    public static boolean isEqual (String[] a, ArrayList<String> s){
        boolean result=false;
        for(int i=0;i<s.size();i++){
            if (s.get(i)!=a[i]){
                result=false;
            }
            else {
                result=true;
            }
        }
        return result;
    }
    // ??? ???????? ??????????? ???????.
}


