package com.company;

public class Main {

    public static void main(String[] args) {
    for (int ost, i=0; i<1000; i++) {
        ost=i%4;
        if (ost==0) {continue;}
        System.out.print(i+" ");
        }
    }

}
