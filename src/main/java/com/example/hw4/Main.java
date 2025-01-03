package com.example.hw4;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean calculateEnded = false;

        while(!calculateEnded){
            try{
                calculateEnded = CalculatorApp.start();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
