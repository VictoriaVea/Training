package com.company;

/**
 * Created by Vea on 09.08.2015.
 */
public class Home3 {
    public static void main(String[] args) {
        String t = "Hello Class";
        System.out.println(t);

        String ts = ", and Student!";
        System.out.println(t + ts);
        String[] u = {"zero", "one", "Under key three but one", "three", "four", "Under key five"};
        System.out.println(u[5]);

        System.out.println(u[3 - 1]);

        int x=8;
        for (; x < 11; x++) {
            System.out.println(x);
        }

        String[] s={"How","are","you"};
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i]);
        }

        int b =25;
        int[] m = {10, 20, 25, 30};
        int i = 0;
        while (i < 4) {
            if (m[i] == b) {
                break;
            }
            System.out.println(m[i]);
            i++;
        }

        int d=10;
        int[] n = {10, 20, 25, 30};
        int j = 0;
        while (j < 4) {
            if (n[j] == d) {
                j++;
                continue;
            }
            System.out.println(n[j]);
            j++;
        }
        System.out.println();

        int g = -2;
        int sec = 18;
        int output=g*sec;
        System.out.println(output);
// -36
        g = 0;
        sec = -1000;
        output=g*sec;
        System.out.println(output);
// 0
        g = 113;
        sec = 1;
// 113
        output=g*sec;
        System.out.println(output);
        System.out.println();

        boolean oper = true;
        int a = 10;
        int c = -8;
        rested(a,c,oper);
// 2
        oper = false;
        a = 3;
        c = 2;
        rested(a, c,oper);
// 1
        oper = false;
        a = 0;
        c = -200;
        rested(a, c,oper);

// 200
        oper = true;
        a = 999;
        c = 1;
        rested(a, c,oper);
// 1000


        System.out.println();
        boolean anti = true;
        boolz(anti);
// false
        anti = false;
        boolz(anti);
// true

        System.out.println();
        String[] strings = {"Hello", "World", "Class", "Guys", "Girls", "Everyone", "Goodbye"};
        int w1 = 1;
        int w2 = 3;
        massiv(strings,w1,w2);
// Hello Class

        w1 = 1;
        w2 = 6;
        massiv(strings,w1,w2);
// Hello Everyone

        w1 = 7;
        w2 = 5;
        massiv(strings,w1,w2);
// Goodbye Girls

        w1 = 1;
        w2 = 7;
        massiv(strings,w1,w2);
// Hello Goodbye

        System.out.println();
        System.out.println();
        int[] notstrings1 = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int target = 1;
        counter(notstrings1, target);
// 5
        int[] notstrings2 = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        target = 6;
        counter(notstrings2, target);
// 2
        int[] notstrings3 = {1, 7, 1, 4, 1, 7, 9, 6, 13, 1, 7};
        target = 7;
        counter(notstrings3, target);
// 3

        System.out.println();
        System.out.println();
        int[] input = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int isAllLessThan = 3;
        compare(input,isAllLessThan);
// false
        int[] input1 = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        isAllLessThan = 6;
        compare(input,isAllLessThan);
// false
        int[] input2 = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        isAllLessThan = 7;
        compare(input,isAllLessThan);
// true
        int[] input3 = {-5, -10, -1, -1, -2, -5, -9, 0, -11, -10, -100};
        isAllLessThan = 0;
        compare(input,isAllLessThan);
// false





    }

    public static void rested (int a,int c, boolean oper){
       int rest = 0;
        if (oper==true){
            rest=a+c;
        }
        else {
            rest=a-c;
        }
        System.out.println(rest);
    }

    public static void boolz (boolean anti){
        if (anti==true){
            System.out.println("false");
        }
        else {
            System.out.println("true");
        }
    }

    public static void massiv(String[] strings, int w1, int w2){
        System.out.println(strings[w1-1]+" "+strings[w2-1]);
    }

    public static void counter(int[] notstrings1, int target){
        int vCount=0;
        for (int i=0; i<notstrings1.length; i++){
            if(notstrings1[i]==target){
                vCount++;
            }

        }
        System.out.println(vCount);
    }

    public static void compare(int[] input, int isAllLessThan){
        String out="";
        for (int i=0;i<input.length;i++){
            if (input[i]<isAllLessThan){
                out="true";
            }
            else {
                out="false";
                break;
            }
        }
        System.out.println(out);
    }

}




