package com.example.step12;

import java.util.Scanner;

class Calculator{
    private int firstNumber, secondNumber;
    public Calculator(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public double calculate(String operator){
        switch(operator){
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                if(secondNumber == 0){
                    System.out.println("[오류] 0으로 나눌 수 없음");
                    return 0;
                }
                return firstNumber / secondNumber;
            case "%":
                return firstNumber % secondNumber;
            default:
                System.out.println("[오류] 유효하지 않은 연산자");
                return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");

        if(inputArray.length == 3){
            String operator = inputArray[1];

            int firstNumber = Integer.parseInt(inputArray[0]);
            int secondNumber = Integer.parseInt(inputArray[2]);

            Calculator calculator = new Calculator(firstNumber, secondNumber);
            System.out.println(calculator.calculate(operator));

        } else {
            System.out.println("유효하지 않은 입력: \"숫자1 연산자 숫자2\" 형태로 입력해주세요");
        }
        scanner.close();
    }
}
