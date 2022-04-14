package com.company;

public class Main {

    private static int computeSum(int num1,int num2){
        return num1 + num2;
    }

    private static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    private static int max(int num1, int num2){
        int result;
        if(num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }

    private static double max(double num1, double num2){
        double result;
        if(num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");

        System.out.println("The sum of 50 and 27 is " + Main.computeSum(50,27));
        System.out.println("The sum of 50, 27, and 23 is " + Main.computeSum(50,27,23));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The greater value between 20 and 22 is " + Main.max(20,22));
        System.out.println("The greater value between 2.1 and 2.5 is " + Main.max(2.1,2.5));
    }
}
