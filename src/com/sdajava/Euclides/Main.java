package com.sdajava.Euclides;

public class Main {

    public static int nwd(int a, int b){
        while (a != b){
            if (a > b){
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(Main.nwd(30,25));
    }
}
