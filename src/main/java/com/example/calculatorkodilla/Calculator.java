package com.example.calculatorkodilla;

public class Calculator {
    public int addAToB(int a, int b){
        return a + b;
    }
    public int subtractAFromB(int a, int b) {
        return b - a;
    }
    public void someMethod(){
        System.out.println("It works!");
    }
    public static void main (String[]args){
        Calculator calculator1 = new Calculator();
        calculator1.someMethod();
        int result = calculator1.addAToB(5, 12);
        int result1 = calculator1.subtractAFromB(5, 12);
        System.out.println(result + "and " + result1);
    }
}
