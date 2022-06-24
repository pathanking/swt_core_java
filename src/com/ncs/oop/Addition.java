package com.ncs.oop;

public class Addition {
    public void sum(int x, int y) {
        System.out.println("sum(int x, int y) : " + (x + y));
    }

    public void sum(byte x, byte y) {
        System.out.println("sum(byte x, byte y) : " + (x + y));
    }

    public void sum(short x, short y) {
        System.out.println("sum(short x, short y) : " + (x + y));
    }

    public void sum(long x, long y) {
        System.out.println("sum(long x, long y) : " + (x + y));
    }

    public void sum(float x, float y) {
        System.out.println("sum(float x, float y) : " + (x + y));
    }

    public void sum(double x, double y) {
        System.out.println("sum(double x, double y) : " + (x + y));
    }

    public void sum(Integer x, Integer y) {
        System.out.println("sum(Integer x, Integer y) : " + (x + y));
    }

    public void sum(int... x) { //var args - multiple arguments
        System.out.println("sum(int... x ) : " + (x[0] + x[1]));
    }
}
