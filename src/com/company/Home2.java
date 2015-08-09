package com.company;

/**
 * Created by Vea on 09.08.2015.
 */
public class Home2 {
    public static void main(String[] args) {
        int a=20;
        int b = a + 5;
        String s = "Test String";
        int c = b + a;
        a = 0;

        System.out.println(c == (b + a));
        s = "0";

        int[] i = {1, 2, 3, 4, 5, 5, 5, 1};
        System.out.println(i[1] - i[4]);

        i[4] = i[6];
        System.out.println(i[4]);

        i[0] = i[1] * i[2];
        System.out.println(i[0]);

        System.out.println(s + s + s + s + s);



    }
}
