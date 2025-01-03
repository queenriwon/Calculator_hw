package com.example.step3;

import java.util.Scanner;

class Calculator{
    private AddOperation addOperation;
    private SubstractOperation substractOperation;
    private MultiplyOperation multiplyOperation;
    private DivideOperation divideOperation;

    public Calculator(){
        addOperation = new AddOperation();
        substractOperation = new SubstractOperation();
        multiplyOperation = new MultiplyOperation();
        divideOperation = new DivideOperation();
    }
    public double calculate(String operator, int firstNumber, int secondNumber){
        switch(operator){
            case "+":
                return addOperation.operate(firstNumber, secondNumber);
            case "-":
                return substractOperation.operate(firstNumber, secondNumber);
            case "*":
                return multiplyOperation.operate(firstNumber, secondNumber);
            case "/":
                if(secondNumber == 0){
                    System.out.println("[오류] 0으로 나눌 수 없음");
                    return 0;
                }
                return divideOperation.operate(firstNumber, secondNumber);
            default:
                System.out.println("[오류] 유효하지 않은 연산자");
                return 0;
        }
    }
}

class AddOperation{
    double operate(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}
class SubstractOperation{
    double operate(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
}
class MultiplyOperation {
    double operate(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
}
class DivideOperation{
    double operate(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
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

            Calculator calculator = new Calculator();
            System.out.println(calculator.calculate(operator, firstNumber, secondNumber));

        } else {
            System.out.println("유효하지 않은 입력: \"숫자1 연산자 숫자2\" 형태로 입력해주세요");
        }
        scanner.close();
    }
}
