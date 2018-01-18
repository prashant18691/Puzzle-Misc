package com.puzzle;

public class Test {
static int i = 0;
public static void main(String[] args) {
i++;
System.out.println("inside main block : " + i);
}
static {
i++;
System.out.println("inside static block : " +
i);
}
}
