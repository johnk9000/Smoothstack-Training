/* 
@author John Kim
Java program that will print out various triangle patterns made of asterisks
*/
//package com.ss.basics.printpattern;

public class PrintPatternJK {
    
    public static void main(String[] args) {
        // line break var
        String lineBreak = "----------";
        // 1) Right triangle
        for(int i = 0; i < 4; i++) {
            // printing astericks per row
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(lineBreak);
        // 2) Upside-down right triangle
        for(int i = 0; i < 4; i++) {
            // printing astericks per row
            for(int j = 4; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(lineBreak);
        // 3) Triangle

        System.out.println(lineBreak);
        // 4) Upside-down triangle

        System.out.println(lineBreak);
    }

}

